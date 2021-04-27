package com.iweb.lesson14;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 14:02
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("二哈");
        Person person = new Person();
        person.setName("张三");
        person.setDog(dog);
        person.play();

        person.play(dog);

    }

}
