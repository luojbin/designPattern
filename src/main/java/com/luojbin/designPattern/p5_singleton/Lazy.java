package com.luojbin.designPattern.p5_singleton;

/**
 * @author luojbin
 * @create 2018/3/15 10:44
 */
public class Lazy {
        private Lazy(){}

        private static Lazy t;

        public static Lazy getInstance(){
            if(t == null){
                t = new Lazy();
            }
            return t;
        }
    }
