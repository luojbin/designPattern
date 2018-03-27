package com.luojbin.designPattern.p9_template2;

/**
 * @author luojbin
 * @create 2018/3/19 17:01
 */
public abstract class People {
    public void oneDay(){
        getUp();
        if(isWoman()) {
            dress();
        }
        work();
        sleep();
    }

    protected void getUp(){
        System.out.println("起床咯");
    }

    protected void dress(){
        System.out.println("去化妆");
    }

    protected abstract void work();

    protected void sleep(){
        System.out.println("去睡觉");
    }

    protected boolean isWoman(){
        return true;
    }
}
