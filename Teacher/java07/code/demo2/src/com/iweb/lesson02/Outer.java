package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:42
 * 描述: Outer
 */
public class Outer {

    public void show() {

        /**
         * 局部内部类
         */
        class Inner {

            // 不能有静态属性和静态方法
            // static String name;

            public void use() {
                System.out.println("use");
            }
        }

        Inner inner = new Inner();
        inner.use();

    }

}
