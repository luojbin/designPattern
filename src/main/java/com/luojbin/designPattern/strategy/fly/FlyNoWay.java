package com.luojbin.designPattern.strategy.fly;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("其实我不会飞。。。。。。。");
	}

}
