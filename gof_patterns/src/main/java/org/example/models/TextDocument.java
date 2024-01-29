package org.example.models;

public class TextDocument extends GenericDocument {
    @Override
    public void open(){
        System.out.println("Text Document opened!");
        super.open();
    }

    @Override
    public void save(){
        System.out.println("Text document saved!");
        super.save();
    }
}
