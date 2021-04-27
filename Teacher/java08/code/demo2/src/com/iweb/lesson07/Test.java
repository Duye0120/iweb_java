package com.iweb.lesson07;

import java.util.Scanner;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:40
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        System.gc(); // 提示进行垃圾回收操作
        System.currentTimeMillis(); // 系统当前时间戳  毫秒数
        System.out.println("abc");// 输出到控制
        // Scanner scanner = new Scanner(System.in); // 输入
        String javaHome = System.getenv("JAVA_HOME");// 获取系统环境变量
        System.out.println(javaHome);
        System.out.println(System.getenv("username"));
    }
}
