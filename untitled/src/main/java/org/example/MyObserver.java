package org.example;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
            int state = (int) arg;
            System.out.println(state + " state ");
    }
}
