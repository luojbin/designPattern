package com.luojbin.designPattern.p1_strategy2.hero;

import com.luojbin.designPattern.p1_strategy2.suit.Armour;
import com.luojbin.designPattern.p1_strategy2.weapon.Arrow;

public class Archor extends Hero {

    public Archor() {
        super();
        this.weapon = new Arrow();
        this.suit = new Armour();
    }

}
