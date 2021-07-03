package com.ives.sping5.testdemo;

import com.ives.sping5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        // 1.加載spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 獲取配置創建的對象
        User user = context.getBean("user",User.class);

        System.out.println(user);

        user.add();
    }
}
