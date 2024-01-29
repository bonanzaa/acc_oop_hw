package org.example.observers;

import org.example.interfaces.Observer;

public class StatusBar implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer Status: " + message);
    }
}
