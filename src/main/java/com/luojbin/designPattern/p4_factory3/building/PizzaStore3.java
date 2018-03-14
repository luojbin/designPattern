package com.luojbin.designPattern.p4_factory3.building;

import com.luojbin.designPattern.p4_factory3.pizza.Pizza3;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public abstract class PizzaStore3 {
    public Pizza3 orderPizza(String type) {
        Pizza3 pizza3;
        pizza3 = createPizza(type);
        pizza3.prepare();
        pizza3.bake();
        pizza3.cut();
        pizza3.box();
        return pizza3;
    }

    abstract Pizza3 createPizza(String type);
}
