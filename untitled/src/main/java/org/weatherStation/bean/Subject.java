package org.weatherStation.bean;

public interface Subject {
    public void registerObservers(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
