package org.example.commands;

import org.example.interfaces.Command;
import org.example.interfaces.Document;

public class SaveDocumentCommand implements Command {

    private Document document;

    public SaveDocumentCommand(Document document){
        this.document = document;
    }
    @Override
    public void execute() {
        document.save();;
    }
}
