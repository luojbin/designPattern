package com.luojbin.designPattern.p4_factory2.pizza;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYstylePepperPizza extends Pizza2 {
    public NYstylePepperPizza() {
        name = "纽约胡椒饼";
        dough = "薄面团";
        sauce = "胡椒粉酱";
        toppings.add("胡椒 胡椒 胡椒");
    }
}
