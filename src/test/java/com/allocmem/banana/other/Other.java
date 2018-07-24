package com.allocmem.banana.other;

import org.apache.log4j.Logger;

/**
 * @auther zhoudazhuang
 * @date 18-7-24 13:48
 * @description
 */
public class Other {
        public static void main(String[] args) {
            new Test().test();
        }
}
class Test {
    final Logger LOGGER = Logger.getLogger(Test.class);
    public void test() {
        LOGGER.info("hello this is log4j info log");
        LOGGER.debug("hello this is log4j debug log");
    }
}