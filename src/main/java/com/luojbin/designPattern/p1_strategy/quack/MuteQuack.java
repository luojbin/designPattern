package com.luojbin.designPattern.p1_strategy.quack;

public class MuteQuack implements QuackBehavior {

    public void yell() {
        System.out.println("哑巴鸭子，不会叫");
    }

}
