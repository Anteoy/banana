package com.allocmem.banana.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 13:12
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dispatcher-servlet.xml");
        Saying br = (Saying) ac.getBean("test_component");
        br.saying();
    }
}
