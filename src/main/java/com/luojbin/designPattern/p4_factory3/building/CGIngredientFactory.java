package com.luojbin.designPattern.p4_factory3.building;

import com.luojbin.designPattern.p4_factory3.ingredient.*;
import com.luojbin.designPattern.p4_factory3.ingredient.NY.*;

public class CGIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new NYVeg1(), new NYVeg2(), new NYVeg3()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Seafood createSeafood() {
        return new NYSeafood();
    }
}
