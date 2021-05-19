package com.cts.strategy;

import com.cts.strategy.behaviour.FlyBehaviour;
import com.cts.strategy.behaviour.QuackBehaviour;
import com.cts.strategy.behaviour.impl.*;
import com.cts.strategy.species.MallardDuck;

public class DuckUSimulator {
    public static void main(String[] args) {
        FlyBehaviour flyBehaviour = new FlyNoWay();
        QuackBehaviour quackBehaviour = new Squeak();

        Duck mallardDuck = new MallardDuck();

        mallardDuck.setFlyBehaviour(flyBehaviour);
        mallardDuck.setQuackBehaviour(quackBehaviour);
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();
    }
}
