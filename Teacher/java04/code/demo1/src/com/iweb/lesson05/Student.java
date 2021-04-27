package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 13:38
 * 描述: Student
 */
public class Student {

    String name;
    int age;

    public Student() {
        // 默认的构造函数： 无参的
        System.out.println("student");
    }

    public void show() {
        System.out.println(name + "\t" + age);
    }

}
