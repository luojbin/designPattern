package com.luojbin.designPattern.p5_singleton;

/**
 * 不安全的延迟实例化，有线程安全的问题，可能会令单例失效
 * @author luojbin
 * @create 2018/3/15 10:59
 */
public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;

    /** fix1.1：增加一个静态变量，用来引用单例对象*/
    private static ChocolateBoiler2 boiler2;

    /** fix1.2：构造器私有 */
    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    /** fix1.3：提供一个静态方法，用以获取单例对象 */
    public static ChocolateBoiler2 getInstance() {
        if (boiler2 == null) {
            boiler2 = new ChocolateBoiler2();
        }
        return boiler2;
    }

    public ChocolateBoiler2(boolean empty) {
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
