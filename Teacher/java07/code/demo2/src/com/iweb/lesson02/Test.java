package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:42
 * 描述: Test
 * 局部内部类：
 * 定义在方法中的类
 * 特征：
 * 1. 局部内部类只能在声明这个类的方法中使用
 * 2. 局部内部类不能有静态属性和静态方法
 */
public class Test {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();

    }
}
