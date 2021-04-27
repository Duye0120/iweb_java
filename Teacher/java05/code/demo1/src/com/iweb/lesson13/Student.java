package com.iweb.lesson13;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 13:55
 * 描述: Student
 */
public abstract class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void study();

}
