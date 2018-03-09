package com.luojbin.designPattern.p1_strategy2.hero;

import com.luojbin.designPattern.p1_strategy2.suit.Shield;
import com.luojbin.designPattern.p1_strategy2.weapon.Stick;

public class Shaman extends Hero {
	public Shaman(){
		this.suit = new Shield();
		this.weapon = new Stick();
	}
}
