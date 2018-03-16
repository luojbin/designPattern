package com.luojbin.designPattern.p6_command.command;

import com.luojbin.designPattern.p6_command.equipment.GarageDoor;
import com.luojbin.designPattern.p6_command.equipment.Video;

/**
 * @author luojbin
 * @create 2018/3/16 10:29
 */
public class VideoOnCommand implements Command {
    Video video;

    public VideoOnCommand(Video video){
        this.video = video;
    }

    @Override
    public void execute() {
        video.on();
        video.setCdname("范特西");
        video.setVolume(11);
    }

    @Override
    public void undo() {

    }

}
