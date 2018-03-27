package com.luojbin.designPattern.p4_factory2.pizza;

import java.util.ArrayList;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public abstract class Pizza2 {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings...");
        for (Object topping : toppings) {
            System.out.println("    " + topping);
        }
    }

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
}
