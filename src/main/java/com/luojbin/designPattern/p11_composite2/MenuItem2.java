package com.luojbin.designPattern.p11_composite2;

import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class MenuItem2 extends MenuComponent2 {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem2(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        String s =  "MenuItem2{" +
                "name='" + name + '\'' +
                // ", description='" + description + '\'' +
                // ", vegetarian=" + vegetarian +
                // ", price=" + price +
                '}';
        System.out.println(s);
    }


    @Override
    public Iterator getMenuIterator(){
        return new NullIterator();
    }
}
