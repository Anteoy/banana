package com.allocmem.banana.dao;

import com.allocmem.banana.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 15:58
 * @description
 */
public class TestForMybatis {
  @Test
  public void testSingleMapper() {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext(
            new String[] {"mybatis.xml", "spring-context.xml", "spring-dispatcher-servlet.xml"});

    UserMapper userMapper = (UserMapper) applicationContext.getBean("singleMapper");
    User user = userMapper.findUserById(1);
    System.out.println(user);
    System.out.println(user.getName());
  }

  @Test
  public void testMultiMapper() {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext(
            new String[] {"mybatis.xml", "spring-context.xml", "spring-dispatcher-servlet.xml"});

    UserMapper userMapper =
        (UserMapper) applicationContext.getBean("userMapper"); // 批量mapper要引用“mapper接口名”，且首字母小写
    User user = userMapper.findUserById(1);
    System.out.println(user);
    System.out.println(user.getName());
  }
}
