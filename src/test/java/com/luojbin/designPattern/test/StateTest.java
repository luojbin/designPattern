package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p12_state.CandyMachine;

import java.util.Scanner;

/**
 * @author luojbin
 * @version 1.0
 * @time 2018-04-01
 */
public class StateTest {

    // @Test
    // public void testState() {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(5);
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("糖果机已就绪, 请选择你的操作:");
            System.out.println("1.投币, 2.退币, 3.扳动手柄,9.退出");
            String select = input.nextLine();
            switch (select) {
                case "1":
                    candyMachine.insertCoin();
                    break;
                case "2":
                    candyMachine.ejectCoin();
                    break;
                case "3":
                    candyMachine.turnCrank();
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
        System.out.println("欢迎下次再来!");
    }
}
