package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 16:04
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        // 由参数列表来决定调用哪个重载的方法
        student.show("str", 100);

    }
}
