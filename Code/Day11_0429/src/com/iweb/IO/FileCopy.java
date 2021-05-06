package com.iweb.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // 完成 文件拷贝 ：
        // 思路分析
        // 1. 创建文件的输入流,将文件读入到程序
        // 2. 创建文件输出流,将读取到的文件数据,写入到指定的文件.

        String sourceFilePath = "D:\\A_WorkSpace\\iweb_java\\Code\\Day11_0429\\src\\com\\iweb\\IO\\hello.txt";
        String copyFilePath = "D:\\hello.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFilePath);
            fileOutputStream = new FileOutputStream(copyFilePath);
            byte[] buf = new byte[8];
            int redLen = 0;
            while ((redLen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,redLen);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
