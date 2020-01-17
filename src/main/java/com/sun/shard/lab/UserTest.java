package com.sun.shard.lab;

import com.alibaba.fastjson.JSONObject;
import com.sun.shard.bean.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setCityId(10);
        user.setEmail("819333460@qq.com");
        user.setName("kk");
        user.setPassword("123456");
        user.setPhone("123456789");
        user.setSex(1);
        System.out.println(JSONObject.toJSONString(user));
    }
}
