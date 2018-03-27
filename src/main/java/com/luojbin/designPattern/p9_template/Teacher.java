package com.luojbin.designPattern.p9_template;

/**
 * @author luojbin
 * @create 2018/3/16 17:29
 */
public class Teacher extends Human{

    @Override
    protected void goToWork() {
        System.out.println("开车去上班");
    }

    @Override
    protected void work() {
        System.out.println("给学生讲课");
    }

    @Override
    protected void goHome() {
        System.out.println("开车回家");
    }
}
