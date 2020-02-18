package com.luojbin.designPattern.p4_factory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一个芝士饼底");
    }

    @Override
    public void bake() {
        System.out.println("烤10分钟");
    }

    @Override
    public void cut() {
        System.out.println("切成6块");
    }

    @Override
    public void box() {
        System.out.println("装在1号盒子");
    }
}
