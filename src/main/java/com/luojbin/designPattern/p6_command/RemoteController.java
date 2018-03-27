package com.luojbin.designPattern.p6_command;

import com.luojbin.designPattern.p6_command.command.Command;
import com.luojbin.designPattern.p6_command.command.NoCommand;

/**
 * @author luojbin
 * @create 2018/3/16 10:37
 */
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    // 为了实现撤销功能，需要记录上一次操作
    private Command lastCommand;

    public RemoteController(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i =0 ; i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    };

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot){
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot){
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoButtonPressed(){
        lastCommand.undo();
        lastCommand = new NoCommand();
    }
}
