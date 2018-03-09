package com.luojbin.designPattern.p4_factory_simple.pizza;

public class ChicagoPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备一个芝加哥饼底");
    }

    @Override
    public void bake() {
        System.out.println("烤15分钟");
    }

    @Override
    public void cut() {
        System.out.println("切成10块");
    }

    @Override
    public void box() {
        System.out.println("装在3号盒子");
    }
}
