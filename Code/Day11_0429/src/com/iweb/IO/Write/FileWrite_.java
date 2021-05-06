package com.iweb.IO.Write;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_ {
    @Test
    public void FileWrite01(){
        String filePath = "D:\\note.txt";
        // 创建fileWrite对象
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);// 默认是覆盖写入
            // write(int) 写入单个字符
            fileWriter.write('H');
            // 写入指定数组(write(char[])
            fileWriter.write(chars);
            // write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("杜也杜也杜也".toCharArray(),0,3);
            // write(String)
            fileWriter.write("你好你好");
            // write(String,off,len)
            fileWriter.write("上海天津背景",2,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 对于fileWriter，一定要关闭流，或者flush才能把真正的数据写入

            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("程序结束");
        }
    }
}
