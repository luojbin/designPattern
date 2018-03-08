package com.luojbin.designPattern.strategy.model;

import com.luojbin.designPattern.strategy.fly.FlyWithWings;
import com.luojbin.designPattern.strategy.quack.Quack;

public class YellowDuck extends Duck {
	public YellowDuck() {
		System.out.println("-----小黄鸭登场-------");
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
}
