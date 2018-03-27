package com.luojbin.designPattern.p3_decorator.condiment;

import com.luojbin.designPattern.p3_decorator.coffee.Beverage;

public abstract class Condiment extends Beverage {
    @Override
    public abstract String getDescription();
}
