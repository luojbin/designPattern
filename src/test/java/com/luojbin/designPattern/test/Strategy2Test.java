package com.luojbin.designPattern.test;

import com.luojbin.designPattern.strategy2.hero.Archor;
import com.luojbin.designPattern.strategy2.hero.Hero;
import com.luojbin.designPattern.strategy2.hero.Knight;
import com.luojbin.designPattern.strategy2.hero.Shaman;

public class Strategy2Test {
	public static void main(String[] args) {
		System.out.println("-------英雄游戏-----");
		
		System.out.println("");
		Hero knight = new Knight();
		Hero shaman = new Shaman();
		Hero archor = new Archor();
		
		System.out.println("---骑士登场---");
		knight.heroAttack();
		knight.heroProtect();
		
		System.out.println("---萨满登场---");
		shaman.heroAttack();
		shaman.heroProtect();
		
		System.out.println("---弓箭手登场---");
		archor.heroAttack();
		archor.heroProtect();
	}
}
