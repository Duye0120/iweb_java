package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:36
 * 描述: Test
 * <p>
 * 普通内部类： 定义在类中、方法外的类。
 * 特征：
 * 1. 普通内部类可以直接访问外部类的属性和方法。
 * 2. 普通内部类中不能有静态属性和静态方法。
 */
public class Test {

    public static void main(String[] args) {

        // 访问内部类的属性和方法
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // 创建了内部类的对象
        inner.use();

    }

}
