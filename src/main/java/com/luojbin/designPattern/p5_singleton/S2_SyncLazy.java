package com.luojbin.designPattern.p5_singleton;

/**
 * synchronized 同步的单例类，解决了线程安全问题，但是同步会造成性能降低
 *
 * @author luojbin
 * @version 1.0
 * @date 2021/9/1 22:25
 */
public class S2_SyncLazy {
    private int field;

    /** fix1.1：增加一个静态变量，用来引用单例对象*/
    private static S2_SyncLazy instance;

    /** fix1.2：构造器私有 */
    private S2_SyncLazy() {}

    /**
     * fix1.3：提供一个静态方法，用以获取单例对象
     * fix2.1: 同步方法，解决线程安全问题，但会降低效率
     */
    public static synchronized S2_SyncLazy getInstance() {
        if (instance == null) {
            instance = new S2_SyncLazy();
        }
        return instance;
    }
}
