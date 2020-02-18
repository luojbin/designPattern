package com.luojbin.designPattern.p11_composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList();
    String name;
    String description;

    public Menu( String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }


    public ArrayList<MenuComponent> getMenuComponents() {
        return menuComponents;
    }

    public void setMenuComponents(ArrayList<MenuComponent> menuComponents) {
        this.menuComponents = menuComponents;
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

        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
        System.out.println(".....end.....");
    }
}
