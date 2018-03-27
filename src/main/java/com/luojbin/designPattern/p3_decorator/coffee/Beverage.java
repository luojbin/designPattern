package com.luojbin.designPattern.p3_decorator.coffee;

public abstract class Beverage {
    String description = "未知饮料";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
