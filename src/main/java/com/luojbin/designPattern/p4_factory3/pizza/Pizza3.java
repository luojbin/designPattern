package com.luojbin.designPattern.p4_factory3.pizza;

import com.luojbin.designPattern.p4_factory3.ingredient.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public abstract class Pizza3 {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepper;
    Seafood seafood;

    public abstract void prepare();

    public void bake() {
        System.out.println("bake for 25 mins");
    }

    public void cut() {
        System.out.println("cut into 4 slices");
    }

    public void box() {
        System.out.println("place pizza in box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
