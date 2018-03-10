package com.luojbin.designPattern.p4_factory2.building;

import com.luojbin.designPattern.p4_factory2.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class CGPizzaStore extends PizzaStore2 {

    @Override
    Pizza2 createPizza(String type) {
        if (type.equals("cheese")) {
            return new CGstyleCheesePizza();
        } else if (type.equals("seafood")) {
            return new CGstyleSeafoodPizza();
        } else if (type.equals("potato")) {
            return new CGstylePotatoPizza();
        } else if (type.equals("pepper")) {
            return new CGstylePepperPizza();
        } else {
            return new CGstyleCheesePizza();
        }

    }
}
