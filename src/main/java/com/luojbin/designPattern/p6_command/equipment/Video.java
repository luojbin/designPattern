package com.luojbin.designPattern.p6_command.equipment;

/**
 * @author luojbin
 * @create 2018/3/16 15:18
 */
public class Video extends Equipment{
    private int volume;
    private String cdname;
    public Video(){
        this.name = "音响系统";
        this.volume = 0;
        this.cdname = "没有CD";
    }

    public void setCdname(String cdname){
        System.out.println("插入CD：" + cdname);
        this.cdname = cdname;
    }

    public void setVolume(int volume){
        System.out.println("设置音量为" + volume);
        this.volume = volume;
    }

}
