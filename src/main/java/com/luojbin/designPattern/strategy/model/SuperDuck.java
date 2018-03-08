package com.luojbin.designPattern.strategy.model;

import com.luojbin.designPattern.strategy.fly.FlyWithWings;
import com.luojbin.designPattern.strategy.quack.Quack;

public class SuperDuck extends Duck {
	public SuperDuck() {
		System.out.println("-----超级鸭登场-------");
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
}
