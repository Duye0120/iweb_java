package com.iweb.lesson12;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 16:23
 * 描述: Test
 */
public class Test {


    public void show(String str) {
        System.out.println("str");
    }

    public void show(int[] arr) {
        System.out.println("arr");
    }

    public static void main(String[] args) {
        Test test = new Test();
        // test.show(null);  // 这里报错
    }

}
