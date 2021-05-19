package com.cts.observer.devices;

public interface Subject { // Newspaper // WeatherData
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
