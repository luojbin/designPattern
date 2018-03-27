package com.luojbin.designPattern.p4_factory.building;

import com.luojbin.designPattern.p4_factory.pizza.CheesePizza;
import com.luojbin.designPattern.p4_factory.pizza.ChicagoPizza;
import com.luojbin.designPattern.p4_factory.pizza.NewYorkPizza;
import com.luojbin.designPattern.p4_factory.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "NewYork":
                pizza = new NewYorkPizza();
                break;
            case "Chicago":
                pizza = new ChicagoPizza();
                break;
        }


        return pizza;
    }
}
