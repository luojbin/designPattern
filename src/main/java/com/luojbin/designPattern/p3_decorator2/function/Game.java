package com.luojbin.designPattern.p3_decorator2.function;

import com.luojbin.designPattern.p3_decorator2.phone.Phone;

public class Game extends Phone{
    private Phone phone;

    public Game (Phone phone){
        this.phone = phone;
    }

    @Override
    public void ring(){
        phone.ring();
        System.out.println("挂了电话还能玩游戏");
    }
}
