package com.luojbin.designPattern.p4_factory3.pizza;

import com.luojbin.designPattern.p4_factory3.building.PizzaIngredientFactory;

/**
 * @author luojbin
 * @create 2018-03-10
 */
public class PepperPizza extends Pizza3 {
    PizzaIngredientFactory ingredientFactory;

    public PepperPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("正在准备" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
