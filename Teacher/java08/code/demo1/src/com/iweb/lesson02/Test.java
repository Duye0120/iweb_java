package com.iweb.lesson02;

import java.io.FileInputStream;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 08:45
 * 描述: Test
 * 异常的分类
 * 运行时异常和检查异常：
 * 1. 运行时异常： 程序在运行的过程中产生异常, 分类为： RuntimeException 和 RuntimeException 的子类
 * 2. 检查异常： 程序本身没有问题，由于外部原因导致的异常。 RuntimeException 以外的异常。
 */
public class Test {

    public static void main(String[] args) {

        // 运行时异常
        // String str = null;
        // System.out.println(str.equals("abc")); // 比较2个字符串的值

        // 检查异常 ： 文件读取
        try {
            // 可能发生检查异常的代码 ： 发生异常的可能性就是 文件不存在. 文件是程序外部的内容,和程序本身无关
            // FileNotFoundException
            FileInputStream in = new FileInputStream("C:\\Users\\jack\\Desktop\\java08\\笔记\\word.txt");
        } catch (Exception e) {
            // 异常发生的时候执行
            e.printStackTrace(); // 打印异常栈追踪的内容
        }

    }

}
