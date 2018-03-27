package com.luojbin.designPattern.p6_command.command;

import com.luojbin.designPattern.p6_command.equipment.GarageDoor;

/**
 * @author luojbin
 * @create 2018/3/16 10:29
 */
public class GarageOnCommand implements Command {
    GarageDoor door;

    public GarageOnCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.on();
    }

    @Override
    public void undo() {

    }

}
