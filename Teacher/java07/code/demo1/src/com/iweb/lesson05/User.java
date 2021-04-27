package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 11:05
 * 描述: User
 */
public class User {

    static String USER_NAME = "admin";

    int number = 200;


    public static void show() {
        System.out.println(USER_NAME);
        // System.out.println(number); // 不能访问
    }

}
