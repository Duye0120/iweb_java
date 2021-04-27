package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 11:09
 * 描述: Test
 */
public class Test {
    static String USER_NAME = "admin"; // 如果写在static代码块之后不能访问

    static {
        System.out.println(1);
        System.out.println(USER_NAME);
        // null
        System.out.println(Test.PASSWORD); // 如果写在static代码块之后可以通过 Test类名访问
    }

    static {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }


    static String PASSWORD = "admin";

    {
        System.out.println("a");
        // System.out.println(name);
        System.out.println(this.name); // null
    }

    {
        System.out.println("b");
    }

    {
        System.out.println("c");
    }

    String name = "jack";

    public static void main(String[] args) throws Exception {

        // Class.forName("com.iweb.lesson06.Test"); // 静态代码块

        // 代码块
        new Test();
    }
}
