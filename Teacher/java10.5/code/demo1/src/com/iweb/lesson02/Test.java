package com.iweb.lesson02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 08:45
 * 描述: Test
 * 1. 将对象保存到文件中
 * 2. 从文件中读取对象
 */
public class Test {

    public void saveObj2File(String path) {

        int a = 100;
        String str = "hello";
        User user = new User("admin", 20);

        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {

            fo = new FileOutputStream(path);
            oo = new ObjectOutputStream(fo);

            // 写入对象
            oo.writeInt(a);
            oo.writeUTF(str);
            oo.writeObject(user);
            oo.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo != null) {
                    fo.close();
                }
                if (oo != null) {
                    oo.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void readObjFromFile(String path) {

        FileInputStream fi = null;
        ObjectInputStream oi = null;
        try {

            fi = new FileInputStream(path);
            oi = new ObjectInputStream(fi);

            // PS: 读取对象流中内容的时候 需要和写入的顺序对应
            System.out.println(oi.readInt());
            System.out.println(oi.readUTF());
            System.out.println(oi.readObject());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fi != null) {
                    fi.close();
                }
                if (oi != null) {
                    oi.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {

        Test test = new Test();

        // test.saveObj2File("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\data.dat");

        test.readObjFromFile("C:\\Users\\jack\\Desktop\\java10.5\\笔记\\data.dat");

    }


}
