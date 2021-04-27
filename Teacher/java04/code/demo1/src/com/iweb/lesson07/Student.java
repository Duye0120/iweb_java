package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 14:17
 * 描述: Student
 */
public class Student {

    String name;
    int age;

    public Student() {
        System.out.println("Student()");
    }

    public Student(String name) {
        System.out.println("Student(String name) :" + name);
        // name = name; // 同名变量问题
        this.name = name; // this = 创建的那个对象
    }

    public Student(int age) {
        System.out.println("Student(int age) :" + age);
        this.age = age;
    }

    public Student(String name, int age) {
        System.out.println("Student(String name, int age) :" + name + "\t" + age);
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name) {
        System.out.println("Student(int age, String name) :" + age + "\t" + name);
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(this.name + "\t" + this.age);
    }
}
