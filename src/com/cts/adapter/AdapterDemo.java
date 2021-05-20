package com.cts.adapter;

import com.cts.adapter.impl.MallardDuck;
import com.cts.adapter.impl.WildTurkey;

public class AdapterDemo {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        testDuck(mallardDuck);

        Turkey turkey = new WildTurkey();
//        testDuck(turkey);
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck){
        duck.quack();;
        duck.fly();
    }
}


// Adapter pattern
// converts the interface of an class into another interface
// the client expects
