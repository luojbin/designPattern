package com.luojbin.designPattern.p12_state;

/**
 * @author luojbin
 * @version 1.0
 * @time 2018-04-01
 */
public class EmptyState implements State {
    private CandyMachine machine;

    public EmptyState(CandyMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("抱歉, 已经没有糖果, 请勿投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("抱歉, 已经没有糖果, 不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("抱歉, 已经没有糖果, 不能转动手柄");
    }

    @Override
    public void dispense() {
        System.out.println("抱歉, 已经没有糖果, 不能出糖");
    }
}
