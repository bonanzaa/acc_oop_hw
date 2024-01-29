package org.example.factories;

import org.example.models.ImageDocument;
import org.example.interfaces.Document;
import org.example.interfaces.DocumentFactory;

public class ImageDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}
