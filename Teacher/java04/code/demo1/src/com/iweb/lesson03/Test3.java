package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 09:34
 * 描述: Test3：String
 */
public class Test3 {

    public void change(String str) {

        str = "abc";

    }

    public static void main(String[] args) {

        Test3 t3 = new Test3();

        String str = "123";
        t3.change(str);
        System.out.println(str); // 123

    }

}
