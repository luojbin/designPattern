package com.luojbin.designPattern.p10_iterator2.iterator;

import com.luojbin.designPattern.p10_iterator2.menu.MenuItem2;

import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018/3/20 9:46
 */
public class DinerIterator2 implements Iterator {
    MenuItem2[] items;
    int position = 0;

    public DinerIterator2(MenuItem2[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem2 menuItem2 = items[position];
        position++;
        return menuItem2;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("至少先执行一次Next()");
        }
        if(items[position] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
