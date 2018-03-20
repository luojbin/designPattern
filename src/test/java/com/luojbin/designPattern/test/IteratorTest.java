package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p10_iterator.Waitress;
import com.luojbin.designPattern.p10_iterator.menu.DinerMenu;
import com.luojbin.designPattern.p10_iterator.menu.PancakeHouseMenu;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/20 17:19
 */
public class IteratorTest {
    @Test
    public void testWaitress() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu2();
    }
}
