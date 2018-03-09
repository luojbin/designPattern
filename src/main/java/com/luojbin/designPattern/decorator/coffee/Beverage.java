package com.luojbin.designPattern.decorator.coffee;

public abstract class Beverage {
    protected String description = "未知饮料";

    public String getDescription(){
        return this.description;
    }
    public abstract double cost();
}
