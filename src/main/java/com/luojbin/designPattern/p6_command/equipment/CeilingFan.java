package com.luojbin.designPattern.p6_command.equipment;

/**
 * @author luojbin
 * @create 2018/3/16 15:43
 */
public class CeilingFan extends Equipment {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    int speed;

    public CeilingFan(String location){
        this.name = "风扇";
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }

    @Override
    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }
}
