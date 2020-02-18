package com.luojbin.designPattern.p1_strategy2.hero;

import com.luojbin.designPattern.p1_strategy2.suit.Armour;
import com.luojbin.designPattern.p1_strategy2.weapon.Sword;

public class Knight extends Hero {

    public Knight() {
        this.suit = new Armour();
        this.weapon = new Sword();
    }
}
