package com.luojbin.designPattern.p11_composite2;


import com.luojbin.designPattern.p11_composite.MenuComponent;

import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Waitress2 {
    MenuComponent2 allMenus;
    public Waitress2(MenuComponent2 allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("---------素食菜单----------");
        while(iterator.hasNext()){
            MenuComponent2 menuComponent2 = (MenuComponent2) iterator.next();
            try{
                if(menuComponent2.isVegetarian()){
                    menuComponent2.print();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
}
