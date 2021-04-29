package com.iweb.lesson01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 使用javabean
        // 保存一个用户的数据
        JavaBeanTest user1 = new JavaBeanTest();
        user1.setId(1);
        user1.setName("张三");
        user1.setAge(20);
        user1.setBirth(sdf.parse("1998-01-01"));

        JavaBeanTest user2 = new JavaBeanTest();
        user2.setId(2);
        user2.setName("小黑");
        user2.setAge(21);
        user2.setBirth(sdf.parse("1998-01-01"));

    }
}
