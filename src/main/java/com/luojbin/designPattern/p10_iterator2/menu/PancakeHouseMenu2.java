package com.luojbin.designPattern.p10_iterator2.menu;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018/3/20 9:12
 */
public class PancakeHouseMenu2 implements Menu{
    ArrayList<MenuItem2> menuItem2s;

    public PancakeHouseMenu2() {
        this.menuItem2s = new ArrayList<>();

        addItem("素包子", "好吃的包子", true, 21.5);
        addItem("肉包子", "好吃的包子", false, 21.5);
        addItem("韭菜包子", "好吃的包子", true, 21.5);
        addItem("汉堡包子", "好吃的包子", false, 21.5);
        addItem("牛肉包子", "好吃的包子", false, 21.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem2 menuItem2 = new MenuItem2(name, description, vegetarian, price);
        menuItem2s.add(menuItem2);
    }

    public ArrayList<MenuItem2> getMenuItem2s() {
        return menuItem2s;
    }

    @Override
    public String toString() {
        return "PancakeHouseMenu2{" +
                "menuItem2s=" + menuItem2s +
                '}';
    }

    public Iterator getIterator() {
        return menuItem2s.iterator();
    }
}
