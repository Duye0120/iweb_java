package com.iweb.IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用FileOutputStream 将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() throws Exception{
        // 创建 FileOutputStream对象
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // 得到 FileOutputStream 对象
            fileOutputStream = new FileOutputStream(filePath);
            // 写入一个字节
            //fileOutputStream.write('H');
            // 写入字符串
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
