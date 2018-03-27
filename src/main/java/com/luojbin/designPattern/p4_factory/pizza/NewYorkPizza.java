package com.luojbin.designPattern.p4_factory.pizza;

public class NewYorkPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一个纽约饼底");
    }

    @Override
    public void bake() {
        System.out.println("烤12分钟");
    }

    @Override
    public void cut() {
        System.out.println("切成8块");
    }

    @Override
    public void box() {
        System.out.println("装在2号盒子");
    }
}
