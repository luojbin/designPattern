package com.luojbin.designPattern.p1_strategy.fly;

public class FlyWithRocket implements FlyBehavior {

    public void fly() {
        System.out.println("用火箭飞噢！真的火箭！");
    }

}
