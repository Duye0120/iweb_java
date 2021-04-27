package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 08:57
 * 描述: User
 */
public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\t" + age;
    }
}
