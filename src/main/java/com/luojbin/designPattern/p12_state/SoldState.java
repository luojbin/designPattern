package com.luojbin.designPattern.p12_state;

/**
 * 糖果机状态-1:
 *
 * @author luojbin
 * @create 2018-04-01
 */
public class SoldState implements State {
    private CandyMachine machine;

    public SoldState(CandyMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("请稍等, 正在出货, 请勿重复投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("正在准备出货, 不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在准备出货, 请勿重复扳动手柄");
    }

    @Override
    public void dispense() {
        machine.releaseCandy();
        if(machine.getCount() > 0){
            machine.setState(machine.getNoCoinState());
        }else{
            System.out.println("抱歉没有糖果了!");
            machine.setState(machine.getEmptyState());
        }
    }
}
