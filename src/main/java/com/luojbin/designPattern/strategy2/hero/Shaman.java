package com.luojbin.designPattern.strategy2.hero;

import com.luojbin.designPattern.strategy2.suit.Shield;
import com.luojbin.designPattern.strategy2.weapon.Stick;

public class Shaman extends Hero {
	public Shaman(){
		this.suit = new Shield();
		this.weapon = new Stick();
	}
}
