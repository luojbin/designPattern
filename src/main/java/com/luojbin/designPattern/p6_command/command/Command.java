package com.luojbin.designPattern.p6_command.command;

/**
 * 命令接口
 *
 * @author luojbin
 * @create 2018/3/16 10:28
 */
public interface Command {
    void execute();
    void undo();
}
