package com.luojbin.designPattern.p12_state;

import java.util.Random;

/**
 * @author luojbin
 * @version 1.0
 * @time 2018-04-01
 */
public class HasCoinState implements State {
    private CandyMachine machine;

    public HasCoinState(CandyMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你已经投币, 请勿重复投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("退出硬币...");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你扳动了手柄, 准备出糖果...");
        Random random = new Random();
        int winner = random.nextInt(10);
        if(winner == 7){
            machine.setState(machine.getWinnerState());
        }else {
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("你还没扳动手柄, 不能给你糖果");
    }
}
