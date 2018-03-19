package com.luojbin.designPattern.p9_template2;

/**
 * @author luojbin
 * @create 2018/3/19 17:04
 */
public class Man extends People {
    @Override
    protected void work() {
        System.out.println("男人负责挣钱养家");
    }

    @Override
    protected boolean isWoman(){
        return false;
    }
}
