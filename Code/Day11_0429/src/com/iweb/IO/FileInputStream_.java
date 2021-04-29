package com.iweb.IO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }


    /**
     * 单个字节的读取,效率比较低
     * -> 使用read[byte[] b]提高效率
     */
    @Test
    public void readFile01() {
        String filePath = "D:\\A_WorkSpace\\iweb_java\\Code\\Day11_0429\\src\\com\\iweb\\IO\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            // 创建FileInputStream对象,用于读取文件
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流获取一个字节的数据.如果没有输入可用,则此方法组织
            // 如果返回-1,则表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流,释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 单个字节的读取,效率比较低
     * -> 使用read[byte[] b]提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "D:\\A_WorkSpace\\iweb_java\\Code\\Day11_0429\\src\\com\\iweb\\IO\\hello.txt";
        int readData = 0;
        // 字节数组
        byte[] buf = new byte[8];// 一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            // 创建FileInputStream对象,用于读取文件
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流获取一个字节的数据.如果没有输入可用,则此方法组织
            // 如果返回-1,则表示读取完毕
            // 如果读取正常,返回实际读取的数字
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0, readLen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流,释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
