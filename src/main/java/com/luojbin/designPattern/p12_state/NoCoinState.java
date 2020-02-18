package com.luojbin.designPattern.p12_state;

/**
 * 糖果机状态-1:有糖果 没有投币
 *
 * @author luojbin
 * @create 2018-04-01
 */
public class NoCoinState implements State {
    private CandyMachine machine;

    public NoCoinState(CandyMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你投入了一个硬币");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("你尚未投币, 不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("你尚未投币, 不能扳动手柄");
    }

    @Override
    public void dispense() {
        System.out.println("你尚未投币, 不能给你糖果");
    }
}
