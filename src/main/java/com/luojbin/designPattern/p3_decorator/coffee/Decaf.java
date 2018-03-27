package com.luojbin.designPattern.p3_decorator.coffee;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "这是一杯 decaf ";
    }

    @Override
    public double cost() {
        return 1;
    }
}
