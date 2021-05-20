package com.cts.adapter.impl;

import com.cts.adapter.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Turkey Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey flying");
    }
}
