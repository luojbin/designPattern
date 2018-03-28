package com.luojbin.designPattern.p11_composite;

/**
 *
 * @author luojbin
 * @create 2018-03-28
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
