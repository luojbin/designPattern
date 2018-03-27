package com.luojbin.designPattern.p5_singleton;

/**
 * 双重检查加锁同步机制，只在第一次创建对象时进行同步操作
 * 在保证单例线程安全的同时也保证了程序效率
 *
 * @create 2018/3/15 10:59
 */
public class ChocolateBoiler5 {
    private boolean empty;
    private boolean boiled;

    /** fix1.1：增加一个静态变量，用来引用单例对象*/
    /** fix4.1: 增加 volatile 关键字， */
    private volatile static ChocolateBoiler5 boiler2;

    /** fix1.2：构造器私有 */
    private ChocolateBoiler5() {
        empty = true;
        boiled = false;
    }

    /** fix1.3：提供一个静态方法，用以获取单例对象 */
    /** fix4.2: 双重检查枷锁，在第一次时同步以保证单例 */
    public static ChocolateBoiler5 getInstance() {
        if (boiler2 == null) {
            synchronized (ChocolateBoiler2.class){
                if (boiler2 == null) {
                    boiler2 = new ChocolateBoiler5();
                }
            }
        }
        return boiler2;
    }

    public ChocolateBoiler5(boolean empty) {
        this.empty = empty;
    }

    /**
     * 空 可以加
     */
    public void fill() {
        if (!isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    /**
     * 非空 且 开 可以倒
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;
        }
    }

    /**
     * 非空 且 非开 可以煮
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
