package com.iweb.lesson14;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 14:02
 * 描述: Person
 */
public class Person {

    private String name;

    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void play() {
        System.out.println(name + "溜狗" + dog.getName());
    }

    public void play(Dog dog) {
        System.out.println(name + "溜狗" + dog.getName());
    }

}
