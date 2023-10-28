package org.example;

import java.util.Observable;

public class MySubject extends Observable {

    private int state;

    public void setState(int state) {
        this.state = state;
        stateChanged(state);
    }

    public void stateChanged(int state) {
        setChanged();
        notifyObservers(state);
    }
}
