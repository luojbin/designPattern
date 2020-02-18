package com.luojbin.designPattern.p3_decorator.condiment;

import com.luojbin.designPattern.p3_decorator.coffee.Beverage;

public class Soy extends Condiment {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.0001 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",soy";
    }
}
