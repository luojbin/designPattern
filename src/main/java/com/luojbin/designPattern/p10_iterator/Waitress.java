package com.luojbin.designPattern.p10_iterator;

import com.luojbin.designPattern.p10_iterator.iterator.Iterator;
import com.luojbin.designPattern.p10_iterator.menu.DinerMenu;
import com.luojbin.designPattern.p10_iterator.menu.MenuItem;
import com.luojbin.designPattern.p10_iterator.menu.PancakeHouseMenu;

import java.util.ArrayList;

/**
 * @author luojbin
 * @create 2018/3/20 9:32
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] dinerItems = dinerMenu.getMenuItems();

        for(int i = 0; i< breakfastItems.size();i++){
            MenuItem item = (MenuItem)breakfastItems.get(i);
            System.out.println(item);
        }

        for(int i = 0; i< dinerItems.length;i++){
            MenuItem item = dinerItems[i];
            System.out.println(item);
        }
    }

    public void printMenu2(){
        Iterator panckIterator = pancakeHouseMenu.getIterator();
        Iterator dinerIterator = dinerMenu.getIterator();
        printIterator(panckIterator);
        printIterator(dinerIterator);
    }

    public void printIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item);
        }
    }

    public void printBreakfastMenu(){}
    public void printDinnerMenu(){}
    public void printVegetarianMenu(){}
    public boolean isItemVegetarian(MenuItem item){
        return item.isVegetarian();
    }
}
