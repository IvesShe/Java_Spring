package com.ives.sping5.testdemo;

import com.ives.sping5.Book;
import com.ives.sping5.Book2;
import com.ives.sping5.Orders;
import com.ives.sping5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        // 1.加載spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        // 獲取配置創建的對象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1(){
        // 1.加載spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 獲取配置創建的對象
        Book book = context.getBean("book",Book.class);
        book.testDemo();
        System.out.println(book);
    }

    @Test
    public void testOrders(){
        // 1.加載spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 獲取配置創建的對象
        Orders orders = context.getBean("orders", Orders.class);
        orders.ordersTest();
    }

    @Test
    public void testBook2(){
        // 1.加載spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 獲取配置創建的對象
        Book2 book2 = context.getBean("book2",Book2.class);
        book2.testDemo();
        System.out.println(book2);
    }
}


