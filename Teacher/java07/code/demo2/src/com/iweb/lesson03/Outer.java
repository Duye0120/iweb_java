package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:47
 * 描述: Outer
 */
public class Outer {

    static class Inner {
        static String name = "admin";

        public int age = 20;

        public static void show() {
            System.out.println("show");
        }

        public void showAge() {
            System.out.println(age);
        }
    }

}
