package com.luojbin.designPattern.p9_template;

/**
 * @author luojbin
 * @create 2018/3/16 17:32
 */
public class Builder extends Human {
    @Override
    protected void goToWork() {
        System.out.println("步行去上班");
    }

    @Override
    protected void work() {
        System.out.println("搬砖");
    }

    @Override
    protected void goHome() {
        System.out.println("走路回家");
    }
}
