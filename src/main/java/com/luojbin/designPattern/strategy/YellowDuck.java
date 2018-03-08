package com.luojbin.designPattern.strategy;

public class YellowDuck implements Duck{
	private FlyThing wings;
	private SoundThing mouth;
	public void flyBehaviour() {
		wings.fly();
	}

	public void makeSound() {
		mouth.yell();
	}
	
}
