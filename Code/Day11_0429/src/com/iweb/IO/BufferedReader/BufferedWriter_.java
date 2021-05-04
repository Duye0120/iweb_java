package com.iweb.IO.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示bufferedWriter的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\test.txt";
        // 创建BufferedWriter
        // 1. new FileWriter(filePath,true):表示以追加的方式写入
        // 2. new FileWriter(filePath):表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello,dy\n");
        bufferedWriter.write("hello,dy1");
        bufferedWriter.newLine();// 插入一个和系统相关的异常.
        bufferedWriter.write("hello,dy2\n");
        // 插入一个换行
        // 说明:关闭外层流即可,传入的new FileWriter(filePath),会在底层关闭
        bufferedWriter.close();
    }
}
