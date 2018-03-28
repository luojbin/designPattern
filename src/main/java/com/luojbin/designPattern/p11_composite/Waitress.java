package com.luojbin.designPattern.p11_composite;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
