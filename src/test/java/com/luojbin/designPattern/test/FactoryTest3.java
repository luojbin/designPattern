package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p4_factory3.building.NYPizzaStore;
import com.luojbin.designPattern.p4_factory3.building.PizzaStore3;
import com.luojbin.designPattern.p4_factory3.pizza.Pizza3;

/**
 * 抽象工厂模式
 * 一个抽象的工厂（抽象类或接口，PizzaIngredientFactory），<br/>
 * 提供了一系列的调用接口（抽象方法，生产各种原料的方法）<br/>
 * 这一系列接口的具体实现由其子类提供。
 *
 * 具体使用时，声明抽象工厂 = 某具体子类，然后调用抽象工厂中的各个抽象方法<br/>
 *
 * 优点：对修改封闭，对扩展开放。<br/>
 * 当需要生产抽象工厂中已有类别的新具体产品时，新建一个具体工厂类即可，
 * 不需要修改已有的工厂系列
 *
 * 缺点：编码量巨大
 *
 */
class FactoryTest3 {
    public static void main(String[] args){
        PizzaStore3 pizzaHut = new NYPizzaStore();
        Pizza3 pizza = pizzaHut.orderPizza("cheese");
        System.out.println();


    }

}
