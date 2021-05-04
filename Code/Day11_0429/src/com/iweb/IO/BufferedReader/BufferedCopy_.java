package com.iweb.IO.BufferedReader;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {


        // 1. BufferedReader和BufferedWriter时安装字符操作
        // 2. 不要去操作二进制文件，可能造成文件损坏
        String srcFilePath = "e:\\test.txt";
        String destFilePath = "e:\\test1.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            // 说明：ReadLine 读取一行内容，但没有换行
            while ((line = br.readLine()) != null) {
                // 每读取一行就写入
                bw.write(line);
                // 插入一个换行
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
