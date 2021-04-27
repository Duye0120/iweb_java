package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:46
 * 描述: Test
 * 静态内部类：通过static关键字来修饰的内部类
 */
public class Test {
    public static void main(String[] args) {

        // 调用静态内部类中的静态属性和静态方法
        System.out.println(Outer.Inner.name);
        Outer.Inner.show();

        // 访问成员属性和成员方法： 需要创建内部类的对象
        Outer.Inner inner = new Outer.Inner();// Outer. 引用了内部类
        inner.showAge();


    }
}
