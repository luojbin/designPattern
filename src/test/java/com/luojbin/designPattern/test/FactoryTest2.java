package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p4_factory2.building.CGPizzaStore;
import com.luojbin.designPattern.p4_factory2.building.NYPizzaStore;
import com.luojbin.designPattern.p4_factory2.building.PizzaStore2;
import com.luojbin.designPattern.p4_factory2.pizza.Pizza2;

/**
 * 工厂方法模式:
 * 在父类需要获取一个具体对象的时候, 调用一个方法, 该方法就称为工厂方法<br/></>
 * 而这个方法在父类中是抽象的, 其具体实现放在子类中来完成, 由子类来决定到底创建什么样的对象<br/>
 * 工厂方法让类把实例化推迟到子类中
 */
public class FactoryTest2 {
    public static void main(String[] args){
        PizzaStore2 pizzaHut = new NYPizzaStore();
        Pizza2 pizza = pizzaHut.orderPizza("cheese");
        System.out.println();
        Pizza2 pizza2 = pizzaHut.orderPizza("pepper");
        System.out.println();
        PizzaStore2 pizzaChi = new CGPizzaStore();
        Pizza2 pizza3 = pizzaChi.orderPizza("potato");
        System.out.println();
        Pizza2 pizza4 = pizzaChi.orderPizza("seafood");
    }

}
