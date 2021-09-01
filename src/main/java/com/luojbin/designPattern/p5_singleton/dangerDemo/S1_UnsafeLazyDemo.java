package com.luojbin.designPattern.p5_singleton.dangerDemo;

/**
 * 不安全的延迟实例化，有线程安全的问题，可能会令单例失效
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:25
 */
public class S1_UnsafeLazyDemo {
    private int field;

    /** fix1.1：增加一个静态变量，用来引用单例对象 */
    private static S1_UnsafeLazyDemo instance;

    /** fix1.2：构造器私有 */
    private S1_UnsafeLazyDemo() {
    }

    /** fix1.3：提供一个静态方法，用以获取单例对象 */
    public static S1_UnsafeLazyDemo getInstance() {
        if (instance == null) {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            instance = new S1_UnsafeLazyDemo();
        }
        return instance;
    }
}
