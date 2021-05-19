package com.cts.observer.devices;

public class Forecast implements Observer{
    private Subject weatherDate;

    public Forecast(Subject weatherDate) {
        this.weatherDate = weatherDate;
        this.weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temp " + temperature);
        System.out.println("Humidity" + humidity);
        System.out.println("Pressure" + pressure);
    }
}
