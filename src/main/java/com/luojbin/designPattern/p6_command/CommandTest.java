package com.luojbin.designPattern.p6_command;

import com.luojbin.designPattern.p6_command.command.*;
import com.luojbin.designPattern.p6_command.equipment.GarageDoor;
import com.luojbin.designPattern.p6_command.equipment.Light;
import com.luojbin.designPattern.p6_command.RemoteController;
import com.luojbin.designPattern.p6_command.equipment.Video;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/16 10:39
 */
public class CommandTest {
    @Test
    public void testLight() {
        RemoteController remote = new RemoteController();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand1= new LightOffCommand(light);

        GarageDoor garage = new GarageDoor();
        GarageOnCommand gc = new GarageOnCommand(garage);

        remote.setCommand(1,lightOnCommand, lightOffCommand1);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        System.out.println("这是撤销操作");
        remote.undoButtonPressed();

        Video video = new Video();
        VideoOnCommand videoOnCommand = new VideoOnCommand(video);

        remote.setCommand(2,videoOnCommand,null);
        remote.onButtonPressed(2);

    }

    @Test
    public void testMutilCommand() {
        RemoteController remote = new RemoteController();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garage = new GarageDoor();
        GarageOnCommand garageOn = new GarageOnCommand(garage);
        Video video = new Video();
        VideoOnCommand videoOn = new VideoOnCommand(video);

        Command[] commands = new Command[]{lightOn, garageOn, videoOn};
        MutilCommand mutilOn = new MutilCommand(commands);

        remote.setCommand(1,mutilOn,null);
        remote.onButtonPressed(1);
    }

}
