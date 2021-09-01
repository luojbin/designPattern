package com.luojbin.designPattern.p5_singleton;

/**
 * 不安全的延迟实例化，有线程安全的问题，可能会令单例失效
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:25
 */
public class S1_UnsafeLazy {
    private int field;

    /** fix1.1：增加一个静态变量，用来引用单例对象 */
    private static S1_UnsafeLazy instance;

    /** fix1.2：构造器私有 */
    private S1_UnsafeLazy() {
    }

    /** fix1.3：提供一个静态方法，用以获取单例对象 */
    public static S1_UnsafeLazy getInstance() {
        if (instance == null) {
            instance = new S1_UnsafeLazy();
        }
        return instance;
    }
}
