package com.luojbin.designPattern.p10_iterator2;


import com.luojbin.designPattern.p10_iterator2.menu.DinerMenu2;
import com.luojbin.designPattern.p10_iterator2.menu.Menu;
import com.luojbin.designPattern.p10_iterator2.menu.MenuItem2;
import com.luojbin.designPattern.p10_iterator2.menu.PancakeHouseMenu2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018/3/20 9:32
 */
public class Waitress2 {
    Menu pancakeHouseMenu2;
    Menu dinerMenu2;

    public Waitress2(Menu pancakeHouseMenu2, Menu dinerMenu2) {
        this.pancakeHouseMenu2 = pancakeHouseMenu2;
        this.dinerMenu2 = dinerMenu2;
    }

    public void printMenu() {
        PancakeHouseMenu2 pancakeHouseMenu2 = new PancakeHouseMenu2();
        ArrayList breakfastItems = pancakeHouseMenu2.getMenuItem2s();

        DinerMenu2 dinerMenu = new DinerMenu2();
        MenuItem2[] dinerItems = dinerMenu.getMenuItem2s();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem2 item = (MenuItem2) breakfastItems.get(i);
            System.out.println(item);
        }

        for (int i = 0; i < dinerItems.length; i++) {
            MenuItem2 item = dinerItems[i];
            System.out.println(item);
        }
    }

    public void printMenu2() {
        Iterator panckIterator = pancakeHouseMenu2.getIterator();
        Iterator dinerIterator = dinerMenu2.getIterator();
        printIterator(panckIterator);
        printIterator(dinerIterator);
    }

    public void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem2 item = (MenuItem2) iterator.next();
            System.out.println(item);
        }
    }

    public void printBreakfastMenu() {
    }

    public void printDinnerMenu() {
    }

    public void printVegetarianMenu() {
    }

    public boolean isItemVegetarian(MenuItem2 item) {
        return item.isVegetarian();
    }
}
