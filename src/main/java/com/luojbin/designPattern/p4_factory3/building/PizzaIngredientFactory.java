package com.luojbin.designPattern.p4_factory3.building;

import com.luojbin.designPattern.p4_factory3.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Seafood createSeafood();
}
