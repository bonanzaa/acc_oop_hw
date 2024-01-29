package org.example.adapters;

import org.example.interfaces.Command;
import org.example.interfaces.Document;

public class DocumentAdapter implements Command {

    private Document document;

    public DocumentAdapter(Document document){
        this.document = document;
    }
    @Override
    public void execute() {
        document.open();
    }
}
