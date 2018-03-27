package com.luojbin.designPattern.p1_strategy.quack;

public class Squeak implements QuackBehavior {

    public void yell() {
        System.out.println("橡皮鸭子，吱吱叫");
    }

}
