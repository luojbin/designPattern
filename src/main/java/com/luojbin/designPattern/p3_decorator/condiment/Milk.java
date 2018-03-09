package com.luojbin.designPattern.p3_decorator.condiment;

import com.luojbin.designPattern.p3_decorator.coffee.Beverage;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost(){
        return 0.01 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",milk";
    }
}
