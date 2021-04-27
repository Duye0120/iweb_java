package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 10:45
 * 描述: Test
 * 固定长度字符串
 */
public class Test {

    public static void main(String[] args) {

        String hello = "hello";
        // 产生了一个新的字符串
        String helloWorld = hello.concat(" word"); // 连接字符串 其效果相当于  hello + " word"
        System.out.println(hello); // 固定长度字符串
        System.out.println(helloWorld);

        StringBuilder sbHello = new StringBuilder("hello");
        // 返回的字符串和 原来的字符串是同一个对象
        StringBuilder sbHelloWorld = sbHello.append(" world");
        System.out.println(sbHello); // hello world  可变长度字符串
        System.out.println(sbHelloWorld); // hello world
        System.out.println(sbHello == sbHelloWorld); // true

    }

}
