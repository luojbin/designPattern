package com.luojbin.designPattern.p4_factory3.building;


import com.luojbin.designPattern.p4_factory3.pizza.*;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class NYPizzaStore extends PizzaStore3 {


    @Override
    Pizza3 createPizza(String type) {
        Pizza3 pizza;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY CheesePizza");
            case "seafood":
                pizza = new SeafoodPizza(ingredientFactory);
                pizza.setName("NY SeafoodPizza");
            case "potato":
                pizza = new PotatoPizza(ingredientFactory);
                pizza.setName("NY PotatoPizza");
            case "pepper":
                pizza = new PepperPizza(ingredientFactory);
                pizza.setName("NY PepperPizza");
            default:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY CheesePizza");
        }
        return pizza;
    }
}
