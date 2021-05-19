package com.cts.strategy;

import com.cts.strategy.behaviour.FlyBehaviour;
import com.cts.strategy.behaviour.QuackBehaviour;

public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("I can swim");
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

}

// Design Principle
// Identify the aspects of your application that vary
// and separate them from what stays the same

// Program to an interface

// Encapsulate those behaviours
// Favor composition over inheritance (has-a instead of is-a)


// Strategy pattern

// defines a family of algorithms, encapsulate each one,
// and make them interchangeable

// lets the algorithm vary independently from the clients that use it.

