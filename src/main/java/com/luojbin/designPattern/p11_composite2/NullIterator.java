package com.luojbin.designPattern.p11_composite2;

import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-30
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
