package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p1_strategy.fly.FlyWithRocket;
import com.luojbin.designPattern.p1_strategy.model.Duck;
import com.luojbin.designPattern.p1_strategy.model.FakeDuck;
import com.luojbin.designPattern.p1_strategy.model.SuperDuck;
import com.luojbin.designPattern.p1_strategy.model.YellowDuck;
import com.luojbin.designPattern.p1_strategy.quack.MuteQuack;

class StrategyTest {
	public static void main(String[] args) {
		Duck yellow = new YellowDuck();
		yellow.performFly();
		yellow.perfotmQuack();
		yellow.perfotmSwim();
		
		System.out.println();
		
		Duck faker = new FakeDuck();
		faker.performFly();
		faker.perfotmQuack();
		faker.perfotmSwim();
		
		System.out.println();
		
		Duck sduck = new SuperDuck();
		sduck.performFly();
		sduck.perfotmQuack();
		sduck.perfotmSwim();
		System.out.println("====超级鸭要变身！====");
		sduck.setFlyBehavior(new FlyWithRocket());
		sduck.setQuackBehavior(new MuteQuack());
		System.out.println("====超级鸭变身完成！====");
		sduck.performFly();
		sduck.perfotmQuack();
		sduck.perfotmSwim();
		
	}
}
