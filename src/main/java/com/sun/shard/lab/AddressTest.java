package com.sun.shard.lab;


import com.alibaba.fastjson.JSONObject;
import com.sun.shard.bean.Address;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCode("0010");
        address.setLit(10);
        address.setName("KG");
        address.setPid("123");
        address.setType(20);
        System.out.println(JSONObject.toJSONString(address));
    }
}
