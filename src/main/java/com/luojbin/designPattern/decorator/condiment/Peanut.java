package com.luojbin.designPattern.decorator.condiment;

import com.luojbin.designPattern.decorator.coffee.Beverage;

public class Peanut extends Condiment {
    Beverage beverage;

    public Peanut(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost(){
        return 0.001 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",peanut";
    }
}
