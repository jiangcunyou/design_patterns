package org.weatherStation.bean;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions " + " temp : " + temprature + " humidity : " + humidity);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temprature = weatherData.getTemprature();
            this.humidity = weatherData.getHumidity();
            //display();
        }
    }
}
