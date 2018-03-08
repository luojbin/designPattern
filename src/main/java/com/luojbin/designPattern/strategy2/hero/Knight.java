package com.luojbin.designPattern.strategy2.hero;

import com.luojbin.designPattern.strategy2.suit.Armour;
import com.luojbin.designPattern.strategy2.weapon.Sword;

public class Knight extends Hero {
	
	public Knight(){
		this.suit = new Armour();
		this.weapon = new Sword();
	}
}
