package com.luojbin.designPattern.p10_iterator2;

import com.luojbin.designPattern.p10_iterator.Waitress;
import com.luojbin.designPattern.p10_iterator.menu.DinerMenu;
import com.luojbin.designPattern.p10_iterator.menu.PancakeHouseMenu;
import com.luojbin.designPattern.p10_iterator2.Waitress2;
import com.luojbin.designPattern.p10_iterator2.menu.DinerMenu2;
import com.luojbin.designPattern.p10_iterator2.menu.Menu;
import com.luojbin.designPattern.p10_iterator2.menu.PancakeHouseMenu2;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/20 17:19
 */
public class IteratorTest2 {
    @Test
    public void testWaitress() {
        Menu pancakeHouseMenu = new PancakeHouseMenu2();
        Menu dinerMenu = new DinerMenu2();
        Waitress2 waitress2 = new Waitress2(pancakeHouseMenu, dinerMenu);
        waitress2.printMenu2();
    }
}
