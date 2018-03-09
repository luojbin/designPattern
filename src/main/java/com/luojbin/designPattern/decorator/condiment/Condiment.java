package com.luojbin.designPattern.decorator.condiment;

import com.luojbin.designPattern.decorator.coffee.Beverage;

public abstract class Condiment extends Beverage {
    @Override
    public abstract String getDescription();
}
