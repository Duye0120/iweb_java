package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 09:08
 * 描述: Test
 * 变量的作用域
 * 注意同名变量的问题：
 * 1. 在同一个作用域(同一对 花括号)  不能有同名变量
 * 2. 就近原则
 */
public class Test {

    int a = 100; // 成员变量、实例变量: 类中、方法外

    public void show(int num) { // 相当于 局部变量
        System.out.println(a); // 引用变量 a
        int b = 200; // 局部变量
        {
            // 代码块
            int c = 300;
        }
        System.out.println(b);
        // System.out.println(c);
        System.out.println(num);

        int a = 400; // 和成员变量同名
        System.out.println(a); // 就近原则
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show(1000);
    }

}
