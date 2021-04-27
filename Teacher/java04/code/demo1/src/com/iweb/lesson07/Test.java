package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 14:20
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("jack", 20);
        Student s2 = new Student("tom", 21);

        System.out.println(s1.name);// jack
        System.out.println(s2.name);// tom

        s1.show();
        s2.show();

    }
}
