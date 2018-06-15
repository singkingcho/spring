package com.daodaofun;

import com.daodaofun.bean.Baby;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public  void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        Baby bean = (Baby) ctx.getBean("baby");
        System.out.println(bean.getAge() + bean.getName());
    }


}
