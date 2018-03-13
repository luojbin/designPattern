package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p4_factory.building.PizzaStore;
import com.luojbin.designPattern.p4_factory.building.SimplePizzaFactory;
import com.luojbin.designPattern.p4_factory.pizza.Pizza;

class FactoryTest {
    public static void main(String[] args){
        PizzaStore pizzaHut = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaHut.orderPizza("Cheese");

        Pizza pizza2 = pizzaHut.orderPizza("NewYork");

        Pizza pizza3 = pizzaHut.orderPizza("Chicago");
    }

}
