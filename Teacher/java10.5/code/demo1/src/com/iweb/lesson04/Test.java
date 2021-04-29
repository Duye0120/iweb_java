package com.iweb.lesson04;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 09:23
 * 描述: Test
 */
public class Test {

    public void read(String path) {

        // FileReader reader = null;
        FileInputStream inputStream = null;
        InputStreamReader reader = null;
        try {
//            reader = new FileReader(path);
//            char[] buffer = new char[1024];
//            int len = 0;
//            while ((len = reader.read(buffer)) != -1) {
//                System.out.println(new String(buffer, 0, len));
//            }
            inputStream = new FileInputStream(path);

            Charset charset;
            reader = new InputStreamReader(inputStream, Charset.forName("GBK"));

//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = inputStream.read(buffer)) != -1) {
//                System.out.println(new String(buffer, 0, len));
//            }

            char[] buffer = new char[1024];
            int len = 0;
            while ((len = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void main(String[] args) {

        new Test().read("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\word.txt");

    }
}
