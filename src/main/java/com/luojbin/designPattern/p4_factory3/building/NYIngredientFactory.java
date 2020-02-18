package com.luojbin.designPattern.p4_factory3.building;

import com.luojbin.designPattern.p4_factory3.ingredient.*;
import com.luojbin.designPattern.p4_factory3.ingredient.NY.*;

public class NYIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        System.out.println("NY createDough");
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("NY createSauce");
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("NY createCheese");
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        System.out.println("NY createVeggies");
        return new Veggies[]{new NYVeg1(), new NYVeg2(), new NYVeg3()};
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("NY createPepperoni");
        return new NYPepperoni();
    }

    @Override
    public Seafood createSeafood() {
        System.out.println("NY createSeafood");
        return new NYSeafood();
    }
}
