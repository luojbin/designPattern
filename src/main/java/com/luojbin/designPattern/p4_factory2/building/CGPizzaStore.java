package com.luojbin.designPattern.p4_factory2.building;

import com.luojbin.designPattern.p4_factory2.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class CGPizzaStore extends PizzaStore2 {

    @Override
    Pizza2 createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CGstyleCheesePizza();
            case "seafood":
                return new CGstyleSeafoodPizza();
            case "potato":
                return new CGstylePotatoPizza();
            case "pepper":
                return new CGstylePepperPizza();
            default:
                return new CGstyleCheesePizza();
        }

    }
}
