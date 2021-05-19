package com.cts.strategy.behaviour.impl;

import com.cts.strategy.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
