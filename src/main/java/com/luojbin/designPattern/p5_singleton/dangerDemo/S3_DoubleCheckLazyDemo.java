package com.luojbin.designPattern.p5_singleton.dangerDemo;

/**
 * 双重检查加锁同步机制，只在第一次创建对象时进行同步操作
 * 在保证单例线程安全的同时也保证了程序效率
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:26
 */
public class S3_DoubleCheckLazyDemo {
    private int field;

    /** fix1.1：增加一个静态变量，用来引用单例对象 */
    private static S3_DoubleCheckLazyDemo instance;

    /** fix1.2：构造器私有 */
    private S3_DoubleCheckLazyDemo() {
    }

    /**
     * fix1.3：提供一个静态方法，用以获取单例对象
     * fix3: 双重检查枷锁，在第一次时同步以保证单例
     */
    public static S3_DoubleCheckLazyDemo getInstance() {
        if (instance == null) {
            synchronized (S3_DoubleCheckLazyDemo.class){
                if (instance == null) {
                    instance = new S3_DoubleCheckLazyDemo();
                }
            }
        }
        return instance;
    }
}
