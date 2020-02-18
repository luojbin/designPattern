package com.luojbin.designPattern.p10_iterator.menu;

import com.luojbin.designPattern.p10_iterator.iterator.Iterator;
import com.luojbin.designPattern.p10_iterator.iterator.PancakeIterator;

import java.util.ArrayList;

/**
 * @author luojbin
 * @create 2018/3/20 9:12
 */
public class PancakeHouseMenu implements Iteratable{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("素包子","好吃的包子",true,21.5);
        addItem("肉包子","好吃的包子",false,21.5);
        addItem("韭菜包子","好吃的包子",true,21.5);
        addItem("汉堡包子","好吃的包子",false,21.5);
        addItem("牛肉包子","好吃的包子",false,21.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "PancakeHouseMenu{" +
                "menuItems=" + menuItems +
                '}';
    }

    public Iterator getIterator(){
        return new PancakeIterator(menuItems);
    }
}
