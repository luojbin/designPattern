package com.luojbin.designPattern.p3_decorator2.function;

import com.luojbin.designPattern.p3_decorator2.phone.Phone;

public class MagicRing extends Phone {
    private Phone phone;

    public MagicRing(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void ring() {
        System.out.println("这是彩铃哦");
        phone.ring();
    }
}
