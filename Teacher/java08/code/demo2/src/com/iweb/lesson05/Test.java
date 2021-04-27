package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:16
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        String str = "a";
        for (int i = 0; i < 10000; i++) {
            str += str;
            str.intern(); // 将字符串加入到常量池
            // java.lang.OutOfMemoryError: Java heap space
        }

    }

}
