package com.luojbin.designPattern.p4_factory2.building;

import com.luojbin.designPattern.p4_factory2.pizza.Pizza2;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public abstract class PizzaStore2 {
    public Pizza2 orderPizza(String type) {
        Pizza2 pizza2;
        pizza2 = createPizza(type);
        pizza2.prepare();
        pizza2.bake();
        pizza2.cut();
        pizza2.box();
        return pizza2;
    }

    abstract Pizza2 createPizza(String type);
}
