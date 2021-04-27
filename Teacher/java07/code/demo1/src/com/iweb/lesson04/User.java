package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 10:43
 * 描述: User
 */
public class User {

    // 类加载的时候初始化
    static String USER_NAME = "admin"; // 静态变量全部大写

    private String name; // 创建对象的时候初始化

    // 代码块： 构造函数之前自动执行
    {
        System.out.println("代码块");
    }

    // 静态代码块： 类被加载的时候自动执行
    static {
        System.out.println("静态代码块");
    }

    public User() {
        System.out.println("User()");
    }

    public static void show() {
        System.out.println("public static void show()");
    }


}
