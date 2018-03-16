package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p8_facade.*;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/16 17:53
 */
public class FacadeTest {
    @Test
    public void testFacade() {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Singer singer = new Singer();

        Band fir = new BandFacade(guitar,piano,singer);
        fir.play();
        fir.earnMoney();
        fir.end();
    }
}
