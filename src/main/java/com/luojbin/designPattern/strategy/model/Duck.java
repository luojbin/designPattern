package com.luojbin.designPattern.strategy.model;

import com.luojbin.designPattern.strategy.fly.FlyBehavior;
import com.luojbin.designPattern.strategy.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void perfotmQuack(){
		quackBehavior.yell();
	}

	public void perfotmSwim() {
		System.out.println("鸭子都会游泳");
	}
	
	public void setFlyBehavior(FlyBehavior fly){
		this.flyBehavior = fly;
	}
	
	public void setQuackBehavior(QuackBehavior quack){
		this.quackBehavior = quack;
	}
}
