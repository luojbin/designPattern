package com.luojbin.designPattern.p3_decorator.coffee;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "这是一杯 houseBlend ";
    }
    @Override
    public double cost(){
        return 2;
    }
}
