package com.luojbin.designPattern.p12_state;

/**
 * 糖果机状态:
 * 1-售罄, 没有糖果, 没有投币
 * 2-预备, 有糖果, 没有投币
 * 3-可出货, 有糖果, 有投币
 * 4-出货中
 *
 * @author luojbin
 * @create 2018-04-01
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
}
