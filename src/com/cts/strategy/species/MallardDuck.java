package com.cts.strategy.species;

import com.cts.strategy.Duck;
import com.cts.strategy.behaviour.FlyBehaviour;
import com.cts.strategy.behaviour.QuackBehaviour;

public class MallardDuck extends Duck implements FlyBehaviour {


    @Override
    public void display() {
        System.out.println("Mallard Duck displayed");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
