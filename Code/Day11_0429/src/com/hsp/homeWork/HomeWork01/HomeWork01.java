package com.hsp.homeWork.HomeWork01;

import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        /*
        1. 判断e盘下是否有文件mytemp，如果没有就创建mytemp
        2. 在e:\\mytemp目录下，创建文件hello.txt
        3. 如果hello.txt已经存在，提示该文件已经存在，就不要在重复创建了
        4. 并且在hello.txt文件中，写入hello，world~
        */

        String directoryPath = "e:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            // 创建
            if (file.mkdir()) {
                System.out.printf("创建 %s 创建成功\n",directoryPath);
            }else{
                System.out.printf("创建 %s 创建失败\n",directoryPath);
            }
        }

        String filePath = directoryPath + "\\hello.txt";// e:\mytemp\hello.txt
        file = new File(filePath);
        if (!file.exists()) {
            //创建文件
            if (file.createNewFile()) {
                System.out.println(filePath + "创建成功~");

                // 如果文件存在，我们就是用BufferedReaderWriter字符输入流写入内容
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello,world");
                bufferedWriter.close();
            }else{
                System.out.println(filePath + "创建失败");
            }
        } else {
            // 如果文件已经存在，给出提示信息
            System.out.println(filePath + "已经存在，不在重复创建");
        }
    }
}
