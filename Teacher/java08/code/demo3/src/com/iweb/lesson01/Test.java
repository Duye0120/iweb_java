package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 13:32
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        // 整型 int
        int a = 100;
        int b = 100;

        System.out.println(a == b); // true 基本数据类型

        Integer c = new Integer(100); // class
        Integer d = new Integer(100);
        System.out.println(c == d); // false

        // JDK5 之后提供自动装箱 自动拆箱的机制
        Integer e = 100; // 自动装箱(JVM会帮助我们去创建对象 Integer.valueOf)： 目的就是简化代码 ， 还可以进行方法调用

        /*
        Integer e = Integer.valueOf(100);
         */

        Integer f = 100;

        /**
         * int x = e.intValue();
         * a == e
         */
        System.out.println(a == e); // 1. 类型匹配 2. Integer -> int  自动拆箱

        // 什么时候会自动拆箱：
        // 1. 当包装类型和基本数据类型进行比较的时候
        // 2. 当使用包装类型进行 + - * / 等计算的时候


    }

}
