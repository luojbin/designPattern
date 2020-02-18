package com.luojbin.designPattern.test;

import com.luojbin.designPattern.p11_composite.Menu;
import com.luojbin.designPattern.p11_composite.MenuComponent;
import com.luojbin.designPattern.p11_composite.MenuItem;
import com.luojbin.designPattern.p11_composite.Waitress;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018-03-28
 */
public class CompositeTest {
    @Test
    public void testComposite() {
        MenuComponent pancakeMenu = new Menu("蛋糕菜单","这是一个蛋糕菜单");
        MenuComponent dinnerMenu = new Menu("午餐菜单","这是午餐的菜单");
        MenuComponent cafeMenu = new Menu("咖啡菜单","这个是咖啡菜单");
        MenuComponent dessertMenu = new Menu("点心菜单","这是个点心菜单");

        MenuComponent allMenus = new Menu("所有菜单","这里有餐厅里所有的菜单");

        allMenus.add(pancakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeMenu.add(new MenuItem("纸杯蛋糕","这是个纸杯装的蛋糕",false,1.1));
        pancakeMenu.add(new MenuItem("小蛋糕","这是个纸杯装的蛋糕",false,1.1));
        pancakeMenu.add(new MenuItem("大蛋糕","这是个纸杯装的蛋糕",false,1.1));
        pancakeMenu.add(new MenuItem("黑森林蛋糕","这是个纸杯装的蛋糕",false,1.1));

        dinnerMenu.add(new MenuItem("宫保鸡丁","这是个纸杯装的蛋糕",false,1.1));
        dinnerMenu.add(new MenuItem("回锅肉","这是个纸杯装的蛋糕",false,1.1));
        dinnerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("拿铁","这是个纸杯装的蛋糕",false,1.1));
        cafeMenu.add(new MenuItem("卡布奇诺","这是个纸杯装的蛋糕",false,1.1));
        cafeMenu.add(new MenuItem("美式","这是个纸杯装的蛋糕",false,1.1));

        dessertMenu.add(new MenuItem("榴莲酥","这是个纸杯装的蛋糕",false,1.1));
        dessertMenu.add(new MenuItem("芒果千层","这是个纸杯装的蛋糕",false,1.1));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
