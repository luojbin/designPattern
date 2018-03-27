package com.luojbin.designPattern.p1_strategy.model;

import com.luojbin.designPattern.p1_strategy.fly.FlyWithWings;
import com.luojbin.designPattern.p1_strategy.quack.Quack;

public class YellowDuck extends Duck {
    public YellowDuck() {
        System.out.println("-----小黄鸭登场-------");
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
}
