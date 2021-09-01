package com.luojbin.designPattern.p5_singleton;

/**
 * 通过饿汉模式创建的单例，在类加载后就进行实例化，但会在前期未使用时就开始占用系统资源
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:20
 */
public class S5_Eager {
    private int field;

    /**
     * fix1.1：增加一个静态变量，用来引用单例对象
     * fix5.1: 声明的同时实例化，饿汉式单例
     */
    private static S5_Eager instance = new S5_Eager();

    /** fix1.2：构造器私有 */
    private S5_Eager() {}

    /**
     * fix1.3：提供一个静态方法，用以获取单例对象
     * fix5.2: 饿汉模式实例化，不需要在别的地方创建实例
     */
    public static S5_Eager getInstance() {
        return instance;
    }
}

