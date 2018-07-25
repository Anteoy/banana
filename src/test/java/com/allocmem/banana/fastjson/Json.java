package com.allocmem.banana.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoudazhuang on 18-7-25.
 */
public class Json {


    public static void main(String[] args) {
        String str = "{\n" +
                "  \"array2\": [\n" +
                "    11,\n" +
                "    22,\n" +
                "    33\n" +
                "  ],\n" +
                "  \"array1\": [\n" +
                "    1,\n" +
                "    2,\n" +
                "    3\n" +
                "  ]\n" +
                "}";
        Map<String, List<Integer>> typeRefer = JSONObject.parseObject(str, new TypeReference<Map<String, List<Integer>>>() {
        });
        System.out.println(typeRefer);
        // not correct fastjson exception
//        Map<String,List<Integer>> byClass = JSONObject.parseObject(str,new HashMap<String,List<Integer>>(){}.getClass());
//        System.out.println(byClass);
        // {} 不会走fastjson的内部转化 所以不会exception
        System.out.println(JSON
                .parseObject("{}", new com.alibaba.fastjson.TypeReference<Map<Object, Object>>() {
                }).getClass());
        System.out.println(
                JSON.parseObject("{}", new HashMap<Object, Object>(0).getClass()).getClass());
    }


}
