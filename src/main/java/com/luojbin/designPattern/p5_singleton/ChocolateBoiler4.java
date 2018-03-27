package com.luojbin.designPattern.p5_singleton;

/**
 * 通过饿汉模式创建的单例，在类加载后就进行实例化，但会在前期未使用时就开始占用系统资源
 *
 * @author luojbin
 * @create 2018/3/15 10:59
 */
public class ChocolateBoiler4 {
    private boolean empty;
    private boolean boiled;

    /**
     * fix1.1：增加一个静态变量，用来引用单例对象
     */
    /**
     * fix3.1: 声明的同时实例化，饿汉式单例
     */
    private static ChocolateBoiler4 boiler2 = new ChocolateBoiler4();

    /**
     * fix1.2：构造器私有
     */
    private ChocolateBoiler4() {
        empty = true;
        boiled = false;
    }

    /**
     * fix1.3：提供一个静态方法，用以获取单例对象
     */
    /**
     * fix3.2: 饿汉模式实例化，不需要在别的地方创建实例
     */
    public static ChocolateBoiler4 getInstance() {
        return boiler2;
    }

    public ChocolateBoiler4(boolean empty) {
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
