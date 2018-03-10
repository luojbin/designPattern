package com.luojbin.designPattern.p4_factory2.pizza;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYstylePotatoPizza extends Pizza2 {
    public NYstylePotatoPizza(){
        name = "纽约土豆饼";
        dough = "薄面团";
        sauce = "土豆泥酱";
        toppings.add("土豆 土豆 土豆");
    }
}
