package com.cts.observer.devices;

public interface Observer { // Users  // DisplayDevices

    void update(float temperature, float humidity, float pressure);
}
