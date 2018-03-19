package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p9_template2.Man;
import com.luojbin.designPattern.p9_template2.People;
import com.luojbin.designPattern.p9_template2.Woman;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/19 17:07
 */
public class Template2Test {
    @Test
    public void testTemplateHook() {
        People man = new Man();
        People woman = new Woman();
        man.oneDay();

        System.out.println("--------");
        woman.oneDay();
    }
}
