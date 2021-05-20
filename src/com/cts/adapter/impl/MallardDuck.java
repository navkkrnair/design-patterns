package com.cts.adapter.impl;

import com.cts.adapter.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck Fly");
    }
}
