package com.luojbin.designPattern.p1_strategy.model;

import com.luojbin.designPattern.p1_strategy.fly.FlyWithWings;
import com.luojbin.designPattern.p1_strategy.quack.Quack;

public class SuperDuck extends Duck {
	public SuperDuck() {
		System.out.println("-----超级鸭登场-------");
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
}
