package com.iweb.IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 演示BufferedReader的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\a.txt";
        // 创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line; // 按行读取,效率高
        // 说明
        // 1. readLine() 按行读取文件
        // 2. 当返回null时,表示文件读取完毕
        while((line = bufferedReader.readLine())!= null){

            System.out.println(line);
        }
        // 关闭流,这里注意:只需要关闭BufferedReader,因为底层会自动的去关闭节点流
        // FileReader
        bufferedReader.close();
    }
}
