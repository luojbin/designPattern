package com.luojbin.designPattern.p12_state;

/**
 * @author luojbin
 * @version 1.0
 * @time 2018-04-01
 */
public class WinnerState implements State {
    private CandyMachine machine;

    public WinnerState(CandyMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("你已经投过币, 请勿重复投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("你已经中奖了, 不给退");
    }

    @Override
    public void turnCrank() {
        System.out.println("你已经中奖了, 不要转啦");
    }

    @Override
    public void dispense() {
        machine.releaseCandy();
        if(machine.getCount() == 0){
            machine.setState(machine.getEmptyState());
        }else{
            System.out.println("你是幸运儿, 给你两个糖");
            machine.releaseCandy();
            if(machine.getCount() > 0){
                machine.setState(machine.getNoCoinState());
            }else {
                System.out.println("噢, 没糖了");
                machine.setState(machine.getEmptyState());
            }
        }
    }
}
