package com.luojbin.designPattern.p11_composite2;


import java.util.Iterator;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Waitress2 {
    MenuComponent2 allMenus;
    public Waitress2(MenuComponent2 allMenus){
        this.allMenus = allMenus;
    }

    // 菜单内部调用了迭代器, 处理了内部逻辑
    public void printMenu(){
        allMenus.print();
    }

    // 外部迭代, 以便外部根据需要操作元素
    public void printVegetarianMenu(){

        System.out.println("---------素食菜单----------");
        int count = 0;
        Iterator allMenuIterator = allMenus.getMenuIterator();
        while(allMenuIterator.hasNext()){
            count++;
            MenuComponent2 menuComponent2 = (MenuComponent2) allMenuIterator.next();
            System.out.println("第"+ count +"次, 得到:"+menuComponent2.getName());
            try{
                if(menuComponent2.isVegetarian()){
                    System.out.print("--------> 素菜来了:");
                    menuComponent2.print();
                }
            }catch (UnsupportedOperationException e){}
            System.out.println();
        }
    }
}
