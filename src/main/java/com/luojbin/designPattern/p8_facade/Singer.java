package com.luojbin.designPattern.p8_facade;

/**
 * @author luojbin
 * @create 2018/3/16 17:47
 */
public class Singer {
    public void sing(){
        System.out.println("歌手唱歌");
    }
    
    public void getMoney(){
        System.out.println("歌手200块");
    }
    
    public void end(){
        System.out.println("歌手下台");
    }
}
