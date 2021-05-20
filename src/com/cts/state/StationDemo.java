package com.cts.state;

public class StationDemo {
    public static void main(String[] args) {
        MetroStation station = new MetroStation();
        station.payOk();
        station.payOk();
        station.enter();
        System.out.println("--------------------------");

        station.enter();
    }
}


// State DP
// allows an object to alter its behaviour when its internal state changes.
