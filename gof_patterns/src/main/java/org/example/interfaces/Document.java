package org.example.interfaces;

public interface Document {
    void open();
    void save();
    void addObserver(Observer newStatusBar);
    void removeObserver(Observer newStatusBar);
}
