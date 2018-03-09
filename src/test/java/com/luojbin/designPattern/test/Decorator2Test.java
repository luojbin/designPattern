package com.luojbin.designPattern.test;

import com.luojbin.designPattern.decorator2.function.Game;
import com.luojbin.designPattern.decorator2.function.MagicRing;
import com.luojbin.designPattern.decorator2.phone.Phone;

public class Decorator2Test {

    public static void main(String[] args){
        Phone phone = new Phone();
        phone.ring();

        System.out.println();

        Phone magicRing = new MagicRing(phone);
        magicRing.ring();

        System.out.println();

        Phone game = new Game(magicRing);
        game.ring();

    }
}
