package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:55
 * 描述: Outer
 */
public class Outer {

    private String name = "outer";

    class Inner {

        private String name = "inner";

        public void show() {
            System.out.println(name); // 内部类
            System.out.println(Outer.this.name); // 外部类的
        }

    }

}
