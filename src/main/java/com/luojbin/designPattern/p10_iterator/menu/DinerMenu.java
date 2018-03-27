package com.luojbin.designPattern.p10_iterator.menu;

import com.luojbin.designPattern.p10_iterator.iterator.DinerIterator;
import com.luojbin.designPattern.p10_iterator.iterator.Iterator;

/**
 * @author luojbin
 * @create 2018/3/20 9:12
 */
public class DinerMenu implements Iteratable{
    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("满汉全席","全是肉",true,215);
        addItem("洛阳水席","全是汤",false,201.5);
        addItem("九大簋","全是海鲜",true,210.5);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("菜单已满,不可继续添加");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator getiterator(){
        return new DinerIterator(menuItems);
    }
    @Override
    public String toString() {
        return "PancakeHouseMenu{" +
                "menuItems=" + menuItems +
                '}';
    }

    public Iterator getIterator(){
        return new DinerIterator(menuItems);
    }
}
