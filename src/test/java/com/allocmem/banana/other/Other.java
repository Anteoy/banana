package com.allocmem.banana.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
//    import org.apache.log4j.Logger;
//    final Logger LOGGER = Logger.getLogger(Test.class);
    final Logger LOGGER = LoggerFactory.getLogger(Test.class);
    public void test() {
        LOGGER.info("hello this is slf4j/log4j info log");
        LOGGER.debug("hello this is slf4j/log4j debug log");
    }
}