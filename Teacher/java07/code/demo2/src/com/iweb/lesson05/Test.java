package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:55
 * 描述: Test
 * 内部类和外部类的同名变量问题
 */
public class Test {
    public static void main(String[] args) {

        /*
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // 创建了内部类的对象
         */
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

    }
}
