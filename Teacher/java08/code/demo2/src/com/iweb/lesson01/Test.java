package com.iweb.lesson01;

import java.nio.charset.Charset;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 10:30
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        String str1 = "abc";// 字面量的方式直接进行赋值

        // String(String original)
        String str2 = new String("abc");

        // public String(char value[])
        String str3 = new String(new char[]{'a', 'b', 'c'});

        // public String(byte bytes[], Charset charset)
        String str4 = new String(new byte[]{97, 98, 99}, Charset.forName("UTF-8"));

        // 字符串的比较
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));


    }
}
