package com.luojbin.designPattern.p9_template;

import com.luojbin.designPattern.p9_template.Builder;
import com.luojbin.designPattern.p9_template.Human;
import com.luojbin.designPattern.p9_template.Teacher;
import org.junit.Test;

/**
 * @author luojbin
 * @create 2018/3/16 17:33
 */
public class TemplateTest {
    @Test
    public void testTemplate() {
        System.out.println("这是一个教师的一天。。。");
        Human teacher = new Teacher();
        teacher.oneDayWork();

        System.out.println();
        System.out.println("这是一个建筑工人的一天。。。");
        Human builder = new Builder();
        builder.oneDayWork();
    }
}
