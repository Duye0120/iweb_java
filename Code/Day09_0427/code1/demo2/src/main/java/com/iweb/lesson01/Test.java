package com.iweb.lesson01;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.*;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 10:26
 * 描述: Test
 * 将对象转成json
 */
public class Test {
    public static void main(String[] args) {
        // user -> json
        User user = new User();
        user.setAge(20);
        user.setName("jack");
        user.setId(1);

        String json = JSON.toJSONString(user);
        System.out.println(json);

        // list -> json
        List<String> list = Arrays.asList("a", "b", "c");

        System.out.println(JSON.toJSONString(list));

        // map -> json
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", "1");
        map.put("name", "jack");

        System.out.println(JSON.toJSONString(map));


        // 可以复合使用
        List<User> users = Arrays.asList(new User(1, "jack", 20), new User(2, "tom", 30));
        System.out.println(JSON.toJSONString(users));

        //使用 JSON 转换date
        User u = new User(1, "jack", 20, new Date());

        System.out.println(JSON.toJSONString(u, SerializerFeature.WriteDateUseDateFormat));
        System.out.println(JSON.toJSONStringWithDateFormat(
                u,
                "yyyy/MM/dd HH:mm:ss",
                SerializerFeature.WriteDateUseDateFormat
        ));

    }
}
