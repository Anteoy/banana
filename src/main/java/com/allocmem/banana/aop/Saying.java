package com.allocmem.banana.aop;

import org.springframework.stereotype.Component;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 13:10
 * @description
 */
@Component("test_component")
public class Saying {
    public void saying () {
        System.out.println("from class Saying exec saying()...");
    }
}
