package com.luojbin.designPattern.p4_factory2.pizza;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYstyleCheesePizza extends Pizza2 {
    public NYstyleCheesePizza() {
        name = "纽约芝士饼";
        dough = "薄面团";
        sauce = "芝士酱";
        toppings.add("芝士 芝士 芝士");
    }
}
