package com.iweb.lesson01;

import java.util.HashSet;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:03
 * 描述: HashSetUser
 */
public class HashSetUser {
    public static void main(String[] args) {

        HashSet<User> users = new HashSet<>();

        users.add(new User(1, "admin"));
        users.add(new User(2, "jack"));

        System.out.println(users.size());
        // 简单的输出方式
        System.out.println(users.toString());

    }
}
