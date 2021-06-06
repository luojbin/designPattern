package com.luojbin.designPattern.p7_adapter;

import com.luojbin.designPattern.p7_adapter.NormalMan;
import com.luojbin.designPattern.p7_adapter.SuperMan;
import com.luojbin.designPattern.p7_adapter.SuperManAdapter;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/16 17:40
 */
public class AdapterTest {
    @Test
    public void test() {
        System.out.println("我是一个普通人");
        NormalMan man = new NormalMan();
        man.run();
        man.lift();

        System.out.println();
        System.out.println("变身超人");
        SuperMan superMan = new SuperManAdapter(man);
        superMan.flash();
        superMan.jumpBuilding();
    }
}
