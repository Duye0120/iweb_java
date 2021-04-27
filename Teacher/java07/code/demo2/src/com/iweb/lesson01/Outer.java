package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:37
 * 描述: Outer
 */
public class Outer {

    private String word = "abc";

    /**
     * 普通内部类
     */
    class Inner {

        // 不能拥有静态属性和静态方法
        // static String name;

        public void use() {
            System.out.println(word);
            show();
        }

    }

    public void show() {
        System.out.println("outer show");
    }
}
