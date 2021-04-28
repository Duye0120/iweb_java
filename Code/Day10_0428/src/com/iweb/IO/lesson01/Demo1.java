package com.iweb.IO.lesson01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public List<String> scan(String filePath, List<String> list) {
        File file = new File(filePath);
        File[] files = file.listFiles();// 返回当前路径中所有的文件：文件&文件夹
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                list.add(files[i].getAbsolutePath());
            } else {
                scan(files[i].getAbsolutePath(), list);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        List<String> list = demo1.scan("F:\\A_iweb\\iweb_java\\Teacher\\java9.5\\笔记", new ArrayList<>());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
