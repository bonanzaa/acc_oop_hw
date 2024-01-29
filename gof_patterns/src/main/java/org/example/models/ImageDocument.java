package org.example.models;

import org.example.interfaces.Document;

public class ImageDocument extends GenericDocument{
    @Override
    public void open(){
        System.out.println("Image Document opened!");
        super.open();
    }

    @Override
    public void save(){
        System.out.println("Image document saved!");
        super.save();
    }
}
