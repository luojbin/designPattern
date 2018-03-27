package com.luojbin.designPattern.p1_strategy.model;

import com.luojbin.designPattern.p1_strategy.fly.FlyNoWay;
import com.luojbin.designPattern.p1_strategy.quack.Squeak;

public class FakeDuck extends Duck {
    public FakeDuck() {
        System.out.println("-----小假鸭登场-------");
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
}
