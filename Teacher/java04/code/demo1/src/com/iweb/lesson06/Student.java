package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 13:45
 * 描述: Student
 */
public class Student {


    String name; // field
    int age;

    // method
    public Student() {
        System.out.println("Student()");
    }

    public Student(String name_) {
        System.out.println("Student(String name) :" + name_);
        name = name_;
    }

    public Student(int age_) {
        System.out.println("Student(int age) :" + age_);
        age = age_;
    }

    public Student(String name_, int age_) {
        System.out.println("Student(String name, int age) :" + name_ + "\t" + age_);
        name = name_;
        age = age_;
    }

    public Student(int age_, String name_) {
        System.out.println("Student(int age, String name) :" + age_ + "\t" + name_);
        age = age_;
        name = name_;
    }

}
