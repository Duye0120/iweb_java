package com.iweb.lesson05;

import java.io.File;
import java.io.PrintWriter;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 09:33
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 打印到文件
//        PrintWriter writer = new PrintWriter("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\word.txt");
//        writer.println("123");
//        writer.println("123");
//        writer.println("123");
//        writer.println("123");
//        writer.flush();


        // 打印到控制台
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("hello world");
        writer.flush();


    }
}
