package com.luojbin.designPattern.p11_composite2;

import java.util.Iterator;

/**
 *
 * @author luojbin
 * @create 2018-03-28
 */
public abstract class MenuComponent2 {
    public void add(MenuComponent2 menuComponent2){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent2 menuComponent2){
        throw new UnsupportedOperationException();
    }

    public MenuComponent2 getChild(int i) {
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

    public Iterator getMenuIterator(){
        throw new UnsupportedOperationException();
    }
}
