package com.iweb.lesson01;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 10:36
 * 描述: Test2
 * json字符串 转成对象
 */
public class Test2 {

    public static void main(String[] args) {
        String json = "{\"age\":20,\"id\":1,\"name\":\"jack\"}";

        User user = JSON.parseObject(json, User.class);
        System.out.println(user);

        String jsonArr = "[{\"age\":20,\"id\":1,\"name\":\"jack\"},{\"age\":30,\"id\":2,\"name\":\"tom\"}]";

        List<User> users = JSON.parseArray(jsonArr, User.class);
        System.out.println(Arrays.toString(users.toArray()));

    }

}
