package com.iweb.lesson01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 08:33
 * 描述: Test
 * 字符串缓冲流： 处理流
 */
public class Test {

    public void readFile(String path) {

        FileReader fr = null;
        BufferedReader reader = null;
        try {

            // 初始化流对象
            fr = new FileReader(path);
            reader = new BufferedReader(fr);

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile(String path) {

        FileWriter fw = null;
        BufferedWriter writer = null;
        try {
            fw = new FileWriter(path, true);
            writer = new BufferedWriter(fw);

            writer.newLine(); // 换行
            writer.write("abc \n");
            // writer.newLine();
            writer.write("123");

            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (fw != null) {
                    fw.close();
                }
                if (writer != null) {
                    writer.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {

        Test test = new Test();
        // test.readFile("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\word.txt");
        test.writeFile("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\word.txt");

    }

}
