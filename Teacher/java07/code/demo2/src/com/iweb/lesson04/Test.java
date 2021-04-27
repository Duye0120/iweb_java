package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 13:51
 * 描述: Test
 * 匿名内部类： 不能显式的声明,只能直接调用
 */
public class Test {

    public static void main(String[] args) {
        Outer outer = new Outer() {

            // 方法重写
            public void show() {
                System.out.println("inner show");
            }

        };

        outer.show();
    }

}
