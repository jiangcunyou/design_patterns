package org.weatherStation.bean;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
