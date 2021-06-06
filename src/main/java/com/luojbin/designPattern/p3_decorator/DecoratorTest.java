package com.luojbin.designPattern.p3_decorator;

import com.luojbin.designPattern.p3_decorator.coffee.Beverage;
import com.luojbin.designPattern.p3_decorator.coffee.Decaf;
import com.luojbin.designPattern.p3_decorator.condiment.Milk;
import com.luojbin.designPattern.p3_decorator.condiment.Peanut;

class DecoratorTest {
    public static void main(String[] args){
        Beverage decaf = new Decaf();
        Beverage milkDecaf = new Milk(decaf);
        System.out.println(milkDecaf.getDescription());
        System.out.println(milkDecaf.cost());

        Beverage doubleMilkDecaf = new Milk(milkDecaf);
        System.out.println(doubleMilkDecaf.getDescription());
        System.out.println(doubleMilkDecaf.cost());

        Beverage peanutMilkDecaf = new Peanut(milkDecaf);
        System.out.println(peanutMilkDecaf.getDescription());
        System.out.println(peanutMilkDecaf.cost());
    }




}
