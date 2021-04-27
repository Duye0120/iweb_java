package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 14:10
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        float a = 100.0F;
        float b = 100.0F;

        System.out.println(a == b);// true

        Float c = 100.0F;
        Float d = 100.0F;

        System.out.println(a == c); // true
        System.out.println(c == d);// false

    }

}
