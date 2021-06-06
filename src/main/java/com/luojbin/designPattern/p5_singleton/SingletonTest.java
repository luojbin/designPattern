package com.luojbin.designPattern.p5_singleton;

import com.luojbin.designPattern.p5_singleton.ChocolateBoiler2;
import com.luojbin.designPattern.p5_singleton.Lazy;
import com.luojbin.designPattern.p5_singleton.dangerDemo.DangerLazy;
import com.luojbin.designPattern.p5_singleton.dangerDemo.SynchronizedLazy;

import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/15 10:47
 */
public class SingletonTest {

    @Test
    public void testLazy(){
        Lazy lazy = Lazy.getInstance();
        System.out.println(lazy);
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy2);
        Lazy lazy3 = Lazy.getInstance();
        System.out.println(lazy3);
    }

    @Test
    public void testInSingleThread() {
        Lazy t1 = Lazy.getInstance();
        Lazy t2 = Lazy.getInstance();
        System.out.println(t1 == t2); //true
    }


    public static void main(String[] args) {
        new Thread(() -> {
            DangerLazy t1 = DangerLazy.getInstance();
            SynchronizedLazy t2= SynchronizedLazy.getInstance();
            System.out.println(t1);
            System.out.println(t2);
        }).start();
        new Thread(() -> {
            DangerLazy t1 = DangerLazy.getInstance();
            SynchronizedLazy t2= SynchronizedLazy.getInstance();
            System.out.println(t1);
            System.out.println(t2);
        }).start();
        System.out.println(11111);
    }

    @Test
    public void testBoiler2() throws InterruptedException {
        // 构造器私有，不能从外部直接new
        // ChocolateBoiler2 boiler2 = new ChocolateBoiler2();

        // 使用静态方法来获取单例对象
        ChocolateBoiler2 boiler2 = ChocolateBoiler2.getInstance();
        System.out.println(boiler2);
        ChocolateBoiler2 boiler22 = ChocolateBoiler2.getInstance();
        System.out.println(boiler22);
    }
}
