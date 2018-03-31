package com.luojbin.designPattern.p11_composite2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Menu2 extends MenuComponent2 {
    private ArrayList<MenuComponent2> componentList = new ArrayList<>();
    private String name;
    private String description;
    private MenuIterator menuIterator;

    public Menu2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent2 menuComponent2){
        componentList.add(menuComponent2);
    }

    @Override
    public void remove(MenuComponent2 menuComponent2){
        componentList.remove(menuComponent2);
    }

    @Override
    public MenuComponent2 getChild(int i){
        return componentList.get(i);
    }


    public ArrayList<MenuComponent2> getMenuComponent2s() {
        return componentList;
    }

    public void setMenuComponent2s(ArrayList<MenuComponent2> menuComponent2s) {
        this.componentList = menuComponent2s;
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

        Iterator iterator = componentList.iterator();
        while(iterator.hasNext()){
            MenuComponent2 menuComponent2 = (MenuComponent2) iterator.next();
            menuComponent2.print();
        }
        System.out.println(".....end.....");
    }

    @Override
    public Iterator getMenuIterator(){
        if (menuIterator == null){
            menuIterator = new MenuIterator(componentList.iterator(), name);
        }
        return menuIterator;
    }
}
