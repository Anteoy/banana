package com.allocmem.banana.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 14:00
 * @description
 */
@Controller
public class Sample {
  final Logger LOGGER = Logger.getLogger(Sample.class);
  @ResponseBody
  @RequestMapping(value = "/sample", method = RequestMethod.GET)
  public JSONObject clearMixedPushInRedis(String uid) {
    return JSONObject.parseObject("{\"a\":\"b\"}");
  }

  @RequestMapping({"/velocity_sample" })
  public ModelAndView test(HttpServletRequest request) {
    LOGGER.info("hello this is log4j info log");
    LOGGER.debug("hello this is log4j debug log");
    ModelAndView mv =new ModelAndView();
    mv.addObject("key","hello,velocity！");
    mv.setViewName("velocity_sample");
    return mv;
  }
}
