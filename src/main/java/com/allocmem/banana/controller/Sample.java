package com.allocmem.banana.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther zhoudazhuang
 * @date 18-7-17 14:00
 * @description
 */
@Controller
public class Sample {
  @ResponseBody
  @RequestMapping(value = "/sample", method = RequestMethod.GET)
  public JSONObject clearMixedPushInRedis(String uid) {
    return JSONObject.parseObject("{\"a\":\"b\"}");
  }
}
