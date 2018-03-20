package com.luojbin.designPattern.p10_iterator.iterator;

import com.luojbin.designPattern.p10_iterator.menu.MenuItem;

/**
 * @author luojbin
 * @create 2018/3/20 9:46
 */
public class DinerIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
