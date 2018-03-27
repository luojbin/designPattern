package com.luojbin.designPattern.p6_command.equipment;

/**
 * @author luojbin
 * @create 2018/3/16 10:33
 */
public abstract class Equipment {
    protected String name;
    public void on(){
        System.out.println(name + "打开了！");
    }
    public void off(){
        System.out.println(name + "关闭了！");
    }
}
