package com.luojbin.designPattern.p5_singleton;

/**
 * @author luojbin
 * @create 2018/3/15 11:23
 */
public class Eager {
    private Eager() {
    }

    private static Eager s1 = new Eager();

    public static Eager getStudent() {
        return s1;
    }
}

