package com.luojbin.designPattern.p6_command.command;

import com.luojbin.designPattern.p6_command.equipment.Light;

/**
 * @author luojbin
 * @create 2018/3/16 10:29
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }


}
