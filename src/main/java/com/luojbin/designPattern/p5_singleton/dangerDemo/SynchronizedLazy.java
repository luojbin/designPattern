package com.luojbin.designPattern.p5_singleton.dangerDemo;

/**
 * @author luojbin
 * @create 2018/3/15 10:44
 */
public class SynchronizedLazy {
        private SynchronizedLazy(){
        }

        private static SynchronizedLazy t;

        public static synchronized SynchronizedLazy getInstance(){
            if(t==null){
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                t = new SynchronizedLazy();
            }
            return t;
        }

}
