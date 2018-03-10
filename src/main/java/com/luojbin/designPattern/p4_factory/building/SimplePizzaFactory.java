package com.luojbin.designPattern.p4_factory.building;

import com.luojbin.designPattern.p4_factory.pizza.CheesePizza;
import com.luojbin.designPattern.p4_factory.pizza.ChicagoPizza;
import com.luojbin.designPattern.p4_factory.pizza.NewYorkPizza;
import com.luojbin.designPattern.p4_factory.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("Cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("NewYork")){
            pizza = new NewYorkPizza();
        }else if(type.equals("Chicago")){
            pizza = new ChicagoPizza();
        }


        return pizza;
    }
}
