package com.cts.strategy.behaviour.impl;

import com.cts.strategy.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
