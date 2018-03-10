package com.luojbin.designPattern.p4_factory2.pizza;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYstyleSeafoodPizza extends Pizza2 {
    public NYstyleSeafoodPizza(){
        name = "纽约海鲜饼";
        dough = "薄面团";
        sauce = "海鲜酱";
        toppings.add("海鲜,鱼虾蟹");
    }
}
