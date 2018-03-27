package com.luojbin.designPattern.p10_iterator2.menu;

/**
 * @author luojbin
 * @create 2018/3/20 9:10
 */
public class MenuItem2 {
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem2{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
