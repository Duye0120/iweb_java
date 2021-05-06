package com.iweb.IO.Reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 单个读取
     */
    @Test
    public void readFile01(){
        String filePath = "D:\\A_WorkSpace\\iweb_java\\Code\\Day11_0429\\src\\com\\iweb\\IO\\hello.txt";
        FileReader fileReader = null;
        int data = 0;
        // 1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取,使用read，单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void fileRead02(){
        System.out.println("----------------");
        String filePath = "D:\\hello.txt";
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[8];
        // 1. 创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取,使用read(buf)，返回的是实际读取到的数字
            // 如果返回-1，说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
