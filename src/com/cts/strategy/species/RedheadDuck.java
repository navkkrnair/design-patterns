package com.cts.strategy.species;

import com.cts.strategy.Duck;
import com.cts.strategy.behaviour.FlyBehaviour;

public class RedheadDuck extends Duck implements FlyBehaviour {
    @Override
    public void display() {
        System.out.println("Redhead Duck displayed");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
