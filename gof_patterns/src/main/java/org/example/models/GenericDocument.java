package org.example.models;

import org.example.interfaces.Document;
import org.example.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class GenericDocument implements Document {
    protected List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer newStatusBar){
        observers.add(newStatusBar);
    }

    @Override
    public void removeObserver(Observer oldStatusBar){
        observers.remove(oldStatusBar);
    }

    protected void notifyObservers(String action){
        for(Observer bar : observers){
            bar.update(action);
        }
    }

    public void open() {
        notifyObservers("opened");
    }
    public void save() {
        notifyObservers("saved");
    }
}
