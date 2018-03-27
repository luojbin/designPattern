package com.luojbin.designPattern.p7_adapter;

/**
 * @author luojbin
 * @create 2018/3/16 17:41
 */
public class SuperManAdapter implements SuperMan{
    private NormalMan man;

    public SuperManAdapter(NormalMan man){
        this.man = man;
    }

    @Override
    public void flash() {
        man.run();
        man.run();
    }

    @Override
    public void jumpBuilding() {
        man.lift();
        man.lift();
    }
}
