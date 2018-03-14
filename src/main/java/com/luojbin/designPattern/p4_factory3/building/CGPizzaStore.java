package com.luojbin.designPattern.p4_factory3.building;

import com.luojbin.designPattern.p4_factory3.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class CGPizzaStore extends PizzaStore3 {

    @Override
    Pizza3 createPizza(String type) {
        Pizza3 pizza;
        PizzaIngredientFactory ingredientFactory = new CGIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("CG CheesePizza");
            case "seafood":
                pizza = new SeafoodPizza(ingredientFactory);
                pizza.setName("CG SeafoodPizza");
            case "potato":
                pizza = new PotatoPizza(ingredientFactory);
                pizza.setName("CG PotatoPizza");
            case "pepper":
                pizza = new PepperPizza(ingredientFactory);
                pizza.setName("CG PepperPizza");
            default:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("CG CheesePizza");
        }
        return pizza;
    }
}
