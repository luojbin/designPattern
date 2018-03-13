package com.luojbin.designPattern.p1_strategy2.hero;

import com.luojbin.designPattern.p1_strategy2.suit.Suit;
import com.luojbin.designPattern.p1_strategy2.weapon.Weapon;

public class Hero {
	Suit suit;
	Weapon weapon;
	
	// 创建英雄
    Hero(){
	}
	
	// 发动攻击
	public void heroAttack(){
		weapon.attack();
	}
	
	// 发动防御
	public void heroProtect(){
		suit.protect();
	}
	
	// 更换武器
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	// 更换护甲
	public void setSuit(Suit suit){
		this.suit = suit;
	}
}
