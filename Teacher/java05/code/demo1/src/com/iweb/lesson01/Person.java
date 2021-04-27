package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 08:54
 * 描述: Person
 */
public class Person {

    // private 进行封装, 封装后只能当前中可以访问
    private String name; // 姓名
    private int age;  // 年龄

    private void show() {
        System.out.println(name + "\t" + age);
    }

}
