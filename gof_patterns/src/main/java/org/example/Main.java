package org.example;

import org.example.adapters.DocumentAdapter;
import org.example.commands.OpenDocumentCommand;
import org.example.commands.SaveDocumentCommand;
import org.example.composites.MacroCommand;
import org.example.factories.ImageDocumentFactory;
import org.example.factories.TextDocumentFactory;
import org.example.interfaces.Command;
import org.example.interfaces.Document;
import org.example.interfaces.DocumentFactory;
import org.example.interfaces.Observer;
import org.example.observers.StatusBar;

public class Main {
    public static void main(String[] args) {
        // Creational - factory pattern
        DocumentFactory textDocumentFactory = new TextDocumentFactory();
        DocumentFactory imageDocumentFactory = new ImageDocumentFactory();

        Document textDocument = textDocumentFactory.createDocument();
        Document imageDocument = imageDocumentFactory.createDocument();

        // Behavioural - command
        // encapsulate "open" and "save" operations
        Command openTextDocCommand = new OpenDocumentCommand(textDocument);
        Command saveImageDocCommand = new SaveDocumentCommand(imageDocument);

        // Behavioural - observer
        // notified whenever document is opened/saved
        Observer statusBar = new StatusBar();

        textDocument.addObserver(statusBar);
        imageDocument.addObserver(statusBar);

        // Structural - adapter
        // adapts the "Document" interface to the "Command" interface
        Command adaptedDocumentCommand = new DocumentAdapter(textDocument);
        adaptedDocumentCommand.execute();

        // Structural - composite
        // composite command, executing multiple commands
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(openTextDocCommand);
        macroCommand.addCommand(saveImageDocCommand);
        macroCommand.addCommand(adaptedDocumentCommand);

        macroCommand.execute();

    }
}