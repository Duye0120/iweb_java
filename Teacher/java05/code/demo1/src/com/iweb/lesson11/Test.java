package com.iweb.lesson11;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 13:34
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Person person = new Person();

        // 根据参数列表调用重载方法
        person.show();
        person.show("jack");

    }

}
