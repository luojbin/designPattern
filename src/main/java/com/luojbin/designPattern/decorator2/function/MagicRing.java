package com.luojbin.designPattern.decorator2.function;

import com.luojbin.designPattern.decorator2.phone.Phone;

public class MagicRing extends Phone{
    Phone phone;

    public MagicRing(Phone phone){
        this.phone = phone;
    }

    @Override
    public void ring(){
        System.out.println("这是彩铃哦");
        phone.ring();
    }
}
