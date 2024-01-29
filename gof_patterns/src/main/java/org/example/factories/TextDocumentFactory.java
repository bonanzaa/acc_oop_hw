package org.example.factories;

import org.example.models.TextDocument;
import org.example.interfaces.Document;
import org.example.interfaces.DocumentFactory;

public class TextDocumentFactory implements DocumentFactory {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
