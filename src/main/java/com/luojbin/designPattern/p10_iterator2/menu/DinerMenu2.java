package com.luojbin.designPattern.p10_iterator2.menu;

import com.luojbin.designPattern.p10_iterator2.iterator.DinerIterator2;

import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018/3/20 9:12
 */
public class DinerMenu2 implements Menu{
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    MenuItem2[] menuItem2s;

    public DinerMenu2() {
        this.menuItem2s = new MenuItem2[MAX_ITEMS];

        addItem("满汉全席", "全是肉", true, 215);
        addItem("洛阳水席", "全是汤", false, 201.5);
        addItem("九大簋", "全是海鲜", true, 210.5);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem2 menuItem2 = new MenuItem2(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("菜单已满,不可继续添加");
        } else {
            menuItem2s[numberOfItems] = menuItem2;
            numberOfItems++;
        }
    }

    public MenuItem2[] getMenuItem2s() {
        return menuItem2s;
    }

    public Iterator getiterator() {
        return new DinerIterator2(menuItem2s);
    }

    @Override
    public String toString() {
        return "PancakeHouseMenu2{" +
                "menuItem2s=" + menuItem2s +
                '}';
    }

    public Iterator getIterator() {
        return new DinerIterator2(menuItem2s);
    }
}
