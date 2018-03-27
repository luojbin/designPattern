package com.luojbin.designPattern.p5_singleton;

/**
 * 普通类，通过外部 new 来创建对象，可以创建多个实例
 * @author luojbin
 * @create 2018/3/15 10:59
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public ChocolateBoiler(boolean empty) {
        this.empty = empty;
    }

    /** 空 可以加 */
    public void fill(){
        if(!isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    /** 非空 且 开 可以倒 */
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
        }
    }

    /** 非空 且 非开 可以煮 */
    public void boil(){
        if(!isEmpty() && !isBoiled()) {
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
