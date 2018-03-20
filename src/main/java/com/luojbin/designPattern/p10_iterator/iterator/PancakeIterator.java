package com.luojbin.designPattern.p10_iterator.iterator;

import com.luojbin.designPattern.p10_iterator.menu.MenuItem;

import java.util.ArrayList;

/**
 * @author luojbin
 * @create 2018/3/20 9:46
 */
public class PancakeIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position++;
        return menuItem;
    }
}
