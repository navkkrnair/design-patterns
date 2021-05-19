package com.cts.observer;

import com.cts.observer.devices.*;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {  // Newspaper

    List<Observer> observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged(){
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.removeIf(o -> observer.equals(o));
    }

    @Override
    public void notifyObservers() {
        this.observers.stream()
                .forEach(observer -> observer.update(temperature,humidity,pressure));
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
