package com.iweb.IO.BufferedReader;

import java.io.*;

/**
 * 演示使用BufferedOutputStream 和BufferedInputStream使用
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "e:\\cat.jpg";
        String destFilePath = "e:\\catCopy.jpg";
        // 创建BufferedOutputStream对象BufferedInputSteam对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 因为FileInputStream 是InputStream 子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            // 循环的读取文件,并写入到destFilePaht
            byte[] buff = new byte[1024];
            int readLine = 0;
            // 当返回-1的时候,就表示文件读取完毕
            while ((readLine = bis.read(buff)) != -1){
                bos.write(buff,0,readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流,关闭外层的处理流即可,底层会去关闭节点流
            try {
                if (bis != null){
                    bos.close();
                }
                if (bos!= null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
