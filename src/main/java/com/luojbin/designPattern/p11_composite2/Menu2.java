package com.luojbin.designPattern.p11_composite2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Menu2 extends MenuComponent2 {
    ArrayList<MenuComponent2> menuComponent2s = new ArrayList();
    String name;
    String description;

    public Menu2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent2 menuComponent2){
        menuComponent2s.add(menuComponent2);
    }

    @Override
    public void remove(MenuComponent2 menuComponent2){
        menuComponent2s.remove(menuComponent2);
    }

    @Override
    public MenuComponent2 getChild(int i){
        return menuComponent2s.get(i);
    }


    public ArrayList<MenuComponent2> getMenuComponent2s() {
        return menuComponent2s;
    }

    public void setMenuComponent2s(ArrayList<MenuComponent2> menuComponent2s) {
        this.menuComponent2s = menuComponent2s;
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
    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println("------begin------");

        Iterator iterator = menuComponent2s.iterator();
        while(iterator.hasNext()){
            MenuComponent2 menuComponent2 = (MenuComponent2) iterator.next();
            menuComponent2.print();
        }
        System.out.println(".....end.....");
    }

    @Override
    public Iterator createIterator(){
        return new CompositeIterator2(menuComponent2s.iterator());
    }
}
