package com.cts.strategy.behaviour.impl;

import com.cts.strategy.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
