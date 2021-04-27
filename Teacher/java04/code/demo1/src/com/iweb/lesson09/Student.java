package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 16:01
 * 描述: Student
 */
public class Student {


    public void show() {
        System.out.println("show()");
    }

    // 和返回值无关
//    public int show() {
//        System.out.println("show()");
//        return 0;
//    }


    public void show(String str) {
        System.out.println("show(String str)");
    }

    public void show(int number) {
        System.out.println("show(int number)");
    }

    public void show(String str, int number) {
        System.out.println("show(String str, int number)");
    }

    public void show(int number, String str) {
        System.out.println("show(int number, String str)");
    }


}
