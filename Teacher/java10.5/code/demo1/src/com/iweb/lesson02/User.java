package com.iweb.lesson02;

import java.io.Serializable;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 08:45
 * 描述: User
 */
public class User implements Serializable {

    private String name;
    private Integer age;

    private final static long serialVersionUID = -1;


    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
