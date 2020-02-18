package com.luojbin.designPattern.p6_command.command;

/**
 * @author luojbin
 * @create 2018/3/16 15:52
 */
public class MutilCommand implements Command{
    private Command[] commands;

    public MutilCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command c : commands){
            c.execute();
        }
    }

    @Override
    public void undo() {
        for(Command c : commands){
            c.undo();
        }
    }
}
