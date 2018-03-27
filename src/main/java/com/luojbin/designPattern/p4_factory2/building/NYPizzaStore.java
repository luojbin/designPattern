package com.luojbin.designPattern.p4_factory2.building;

import com.luojbin.designPattern.p4_factory2.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYPizzaStore extends PizzaStore2 {

    @Override
    Pizza2 createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYstyleCheesePizza();
            case "seafood":
                return new NYstyleSeafoodPizza();
            case "potato":
                return new NYstylePotatoPizza();
            case "pepper":
                return new NYstylePepperPizza();
            default:
                return new NYstyleCheesePizza();
        }

    }
}
