package com.luojbin.designPattern.p9_template;

/**
 * @author luojbin
 * @create 2018/3/16 17:26
 */
public abstract class Human {
    public void oneDayWork(){
        getUp();
        wash();
        goToWork();
        work();
        goHome();
        goToBed();

    }

    protected void getUp(){
        System.out.println("起床");
    }

    protected void wash(){
        System.out.println("洗漱洗脸");
    }

    protected abstract void goToWork();
    protected abstract void work();
    protected abstract void goHome();

    protected void goToBed(){
        System.out.println("上床睡觉");
    }

}
