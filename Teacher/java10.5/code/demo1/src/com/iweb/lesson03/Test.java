package com.iweb.lesson03;

import java.io.*;
import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 09:00
 * 描述: Test
 * 1. 将对象保存成字节数组
 * 2. 从字节数组中读取对象
 */
public class Test {

    public byte[] obj2byte() {

        int a = 100;
        String str = "hello";
        User user = new User("admin", 20);

        /**
         * Closing a <tt>ByteArrayOutputStream</tt> has no effect. The methods in
         * this class can be called after the stream has been closed without
         * generating an <tt>IOException</tt>.
         * 字节数组流不需要程序员主动关闭
         */
        ByteArrayOutputStream bo = null;
        ObjectOutputStream oo = null;
        try {
            bo = new ByteArrayOutputStream();
            oo = new ObjectOutputStream(bo); // 通过对象流将对象写入到字节数组中

            oo.writeInt(a);
            oo.writeUTF(str);
            oo.writeObject(user);
            oo.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oo != null) {
                try {
                    oo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return bo.toByteArray();

    }

    public void byte2obj(byte[] bytes) {

        ByteArrayInputStream bi = null;
        ObjectInputStream oi = null;
        try {

            bi = new ByteArrayInputStream(bytes);
            oi = new ObjectInputStream(bi);

            System.out.println(oi.readInt());
            System.out.println(oi.readUTF());
            System.out.println(oi.readObject());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oi != null) {
                try {
                    oi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

        Test test = new Test();
        byte[] bytes = test.obj2byte();
        // System.out.println(Arrays.toString(bytes));
        test.byte2obj(bytes);

    }


}
