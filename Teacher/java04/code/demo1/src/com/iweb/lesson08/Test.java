package com.iweb.lesson08;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 14:24
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.show();
        // 将 student 声明出来的意义在于可能后面的代码还需要用到 student


        int a = 10;
        int b = 20;
        int c = 30;

        // (10 + 20)   (20 + 30)  (20 + 20) : 变量的好处 复用性

        // 如果只是用一次可以使用匿名对象
        new Student().show();
        // new Student().show(); // new 必定申请新的堆内存空间， 新的对象

    }
}
