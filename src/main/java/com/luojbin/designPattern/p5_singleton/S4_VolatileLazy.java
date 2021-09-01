package com.luojbin.designPattern.p5_singleton;

/**
 * 双重检查加锁同步机制，只在第一次创建对象时进行同步操作
 * 在保证单例线程安全的同时也保证了程序效率
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:26
 */
public class S4_VolatileLazy {
    private int field;

    /** fix1.1：增加一个静态变量，用来引用单例对象*/
    /** fix4: 增加 volatile 关键字， */
    private volatile static S4_VolatileLazy instance;

    /** fix1.2：构造器私有 */
    private S4_VolatileLazy() {
    }

    /** fix1.3：提供一个静态方法，用以获取单例对象 */
    /** fix3: 双重检查枷锁，在第一次时同步以保证单例 */
    public static S4_VolatileLazy getInstance() {
        if (instance == null) {
            synchronized (S4_VolatileLazy.class){
                if (instance == null) {
                    instance = new S4_VolatileLazy();
                }
            }
        }
        return instance;
    }
}
