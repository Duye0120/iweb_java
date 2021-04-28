package com.iweb.IO.lesson01;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        File file = new File("F:\\A_iweb\\iweb_java\\Teacher\\java9.5\\笔记\\file\\word.txt");

        // 判断文件是文件还是文件夹
        System.out.println(file.isFile());
        // 查看文件的大小 单位字节
        System.out.println(file.length());
        // 查看文件的最后修改时间
        System.out.println(new Date(file.lastModified()));
        File dir = new File("F:\\A_iweb\\iweb_java\\Teacher\\java9.5\\笔记\\file");
        String[] fileNames = dir.list();
        System.out.println(Arrays.toString(fileNames));

        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getAbsolutePath());
        }
    }
}
