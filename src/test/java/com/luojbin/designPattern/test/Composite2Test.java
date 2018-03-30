package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p11_composite2.Menu2;
import com.luojbin.designPattern.p11_composite2.MenuComponent2;
import com.luojbin.designPattern.p11_composite2.MenuItem2;
import com.luojbin.designPattern.p11_composite2.Waitress2;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class Composite2Test {
    @Test
    public void testComposite() {
        MenuComponent2 pancakeMenu = new Menu2("蛋糕菜单","这是一个蛋糕菜单");
        MenuComponent2 dinnerMenu = new Menu2("午餐菜单","这是午餐的菜单");
        MenuComponent2 cafeMenu = new Menu2("咖啡菜单","这个是咖啡菜单");
        MenuComponent2 dessertMenu = new Menu2("点心菜单","这是个点心菜单");

        MenuComponent2 allMenus = new Menu2("所有菜单","这里有餐厅里所有的菜单");

        allMenus.add(pancakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeMenu.add(new MenuItem2("纸杯蛋糕","这是个纸杯装的蛋糕",false,1.1));
        pancakeMenu.add(new MenuItem2("小蛋糕","这是个纸杯装的蛋糕",true,1.1));
        pancakeMenu.add(new MenuItem2("大蛋糕","这是个纸杯装的蛋糕",true,1.1));
        pancakeMenu.add(new MenuItem2("黑森林蛋糕","这是个纸杯装的蛋糕",false,1.1));

        dinnerMenu.add(new MenuItem2("宫保鸡丁","这是个纸杯装的蛋糕",true,1.1));
        dinnerMenu.add(new MenuItem2("回锅肉","这是个纸杯装的蛋糕",false,1.1));
        dinnerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem2("拿铁","这是个纸杯装的蛋糕",false,1.1));
        cafeMenu.add(new MenuItem2("卡布奇诺","这是个纸杯装的蛋糕",true,1.1));
        cafeMenu.add(new MenuItem2("美式","这是个纸杯装的蛋糕",false,1.1));

        dessertMenu.add(new MenuItem2("榴莲酥","这是个纸杯装的蛋糕",true,1.1));
        dessertMenu.add(new MenuItem2("芒果千层","这是个纸杯装的蛋糕",false,1.1));

        Waitress2 waitress2 = new Waitress2(allMenus);
        waitress2.printMenu();
        waitress2.printVegetarianMenu();
    }

}
