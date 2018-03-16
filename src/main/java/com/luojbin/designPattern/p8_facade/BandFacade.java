package com.luojbin.designPattern.p8_facade;

/**
 * @author luojbin
 * @create 2018/3/16 17:51
 */
public class BandFacade implements Band{
    Guitar guitar;
    Piano piano;
    Singer singer;

    public BandFacade(Guitar guitar, Piano piano, Singer singer){
        this.guitar = guitar;
        this.piano = piano;
        this.singer = singer;
    }

    @Override
    public void play() {
        guitar.tanjita();
        piano.tanqin();
        singer.sing();
    }

    @Override
    public void earnMoney() {
        guitar.getmoney();
        piano.getMoney();
        singer.getMoney();
    }

    @Override
    public void end() {
        guitar.throwG();
        piano.over();
        singer.end();
    }
}
