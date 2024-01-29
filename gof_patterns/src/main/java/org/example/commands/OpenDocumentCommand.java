package org.example.commands;

import org.example.interfaces.Command;
import org.example.interfaces.Document;

public class OpenDocumentCommand implements Command {
    private Document document;

    public OpenDocumentCommand(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
