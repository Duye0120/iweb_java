package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 09:05
 * 描述: Test
 * 面试常见
 */
public class Test {

    // 程序在执行的过程中只要遇到 return 语句方法就终止
    public int fn(int num) {
        int i = 1;
        try {
            int res = 10 / num;
            return ++i; // ++i 会执行 , return不会执行
        } catch (Exception e) {
            e.printStackTrace();
            return ++i;
        } finally {
            return ++i; // 执行 return
        }
    }


    public static void main(String[] args) {

        Test test = new Test();
        int res = test.fn(1);
        System.out.println(res);

    }

}
