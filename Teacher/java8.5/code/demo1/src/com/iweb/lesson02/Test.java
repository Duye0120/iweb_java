package com.iweb.lesson02;


import java.text.SimpleDateFormat;

/**
 * 作者: jack
 * 时间: 2021-04-27 0027 08:50
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 使用javabean
        // 保存一个用户的数据
        User user1 = new User();
        user1.setId(1);
        user1.setName("张三");
        user1.setAge(20);
        user1.setBirth(sdf.parse("1998-01-01"));

        User user2 = new User();
        user1.setId(2);
        user1.setName("小黑");
        user1.setAge(21);
        user1.setBirth(sdf.parse("1998-01-01"));

        // 需要将2条数据 一起保存到一个对象中
        User[] users = new User[2];
        users[0] = user1;
        users[1] = user2;

        // 新增了一条数据： 数据可以用来保存多条数据,但是因为数组的长度是固定, 对于新增和删除数据很不方便
    }
}
