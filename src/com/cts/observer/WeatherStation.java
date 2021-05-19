package com.cts.observer;

import com.cts.observer.devices.CurrentConditions;
import com.cts.observer.devices.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentCondition = new CurrentConditions(weatherData);
        weatherData.setMeasurements(60,55,25.4f);
        System.out.println("---------------------------------------");
        weatherData.removeObserver(currentCondition);
        weatherData.setMeasurements(80,65,35.4f);
    }
}

// Publishers + Subscribers = Observer Pattern

// defines a One-to-Many dependency between objects so that
// when one object changes state, all of its dependents are notified
// and updated automatically
