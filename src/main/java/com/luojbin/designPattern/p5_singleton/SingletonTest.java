package com.luojbin.designPattern.p5_singleton;

import com.luojbin.designPattern.p5_singleton.dangerDemo.S1_UnsafeLazyDemo;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author luojbin
 * @create 2018/3/15 10:47
 */
public class SingletonTest {

    // 普通类
    @Test
    public void testNormal() {
        S0_Normal d1 = new S0_Normal();
        S0_Normal d2 = new S0_Normal();
        assertNotSame(d1, d2);
    }

    // 懒汉 1.0, 有线程安全问题
    @Test
    public void testUnsafeLazy() {
        // 单线程情况下, 没问题
        S1_UnsafeLazy lazy = S1_UnsafeLazy.getInstance();
        System.out.println(lazy);
        S1_UnsafeLazy lazy2 = S1_UnsafeLazy.getInstance();
        System.out.println(lazy2);
        S1_UnsafeLazy lazy3 = S1_UnsafeLazy.getInstance();
        System.out.println(lazy3);
        assertSame(lazy, lazy2);
    }
    @Test
    public void testUnsafeLazy2() {
        // 多线程并发时, 不能保证单例
        S1_UnsafeLazyDemo[] ins = new S1_UnsafeLazyDemo[2];
        new Thread(() -> ins[0] = S1_UnsafeLazyDemo.getInstance()).start();
        new Thread(() -> ins[1] = S1_UnsafeLazyDemo.getInstance()).start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // 两次获取到的对象并不相同
        System.out.println(ins[0]);
        System.out.println(ins[1]);
        assertNotSame(ins[0], ins[1]);
    }

    // 懒汉 2.0, synchronization 同步, 效率低
    @Test
    public void testSyncLazy() {
        S2_SyncLazy[] ins = new S2_SyncLazy[2];
        new Thread(() -> ins[0] = S2_SyncLazy.getInstance()).start();
        new Thread(() -> ins[1] = S2_SyncLazy.getInstance()).start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // 使用 synchronized 能保证单例, 但效率较低
        System.out.println(ins[0]);
        System.out.println(ins[1]);
        assertSame(ins[0], ins[1]);
    }
    // 懒汉 3.0, 双重检查锁
    @Test
    public void testDoubleCheck() {
        S3_DoubleCheckLazy[] ins = new S3_DoubleCheckLazy[2];
        new Thread(() -> ins[0] = S3_DoubleCheckLazy.getInstance()).start();
        new Thread(() -> ins[1] = S3_DoubleCheckLazy.getInstance()).start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(ins[0]);
        System.out.println(ins[1]);
        assertSame(ins[0], ins[1]);
    }
    // 懒汉 4.0, 双重检查锁 + volatile
    // 饿汉单例






    @Test
    public void testInSingleThread() {
        S1_UnsafeLazy t1 = S1_UnsafeLazy.getInstance();
        S1_UnsafeLazy t2 = S1_UnsafeLazy.getInstance();
        System.out.println(t1 == t2); //true
    }


    public static void main(String[] args) {

    }

    @Test
    public void testBoiler2() throws InterruptedException {
        // 构造器私有，不能从外部直接new
        // ChocolateBoiler2 boiler2 = new ChocolateBoiler2();

        // 使用静态方法来获取单例对象
        // ChocolateBoiler2 boiler2 = ChocolateBoiler2.getInstance();
        // System.out.println(boiler2);
        // ChocolateBoiler2 boiler22 = ChocolateBoiler2.getInstance();
        // System.out.println(boiler22);
    }
}
