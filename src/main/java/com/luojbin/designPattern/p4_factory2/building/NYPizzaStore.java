package com.luojbin.designPattern.p4_factory2.building;

import com.luojbin.designPattern.p4_factory2.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYPizzaStore extends PizzaStore2 {

    @Override
    Pizza2 createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYstyleCheesePizza();
        } else if (type.equals("seafood")) {
            return new NYstyleSeafoodPizza();
        } else if (type.equals("potato")) {
            return new NYstylePotatoPizza();
        } else if (type.equals("pepper")) {
            return new NYstylePepperPizza();
        } else {
            return new NYstyleCheesePizza();
        }

    }
}
