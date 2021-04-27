package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:43
 * 描述: B
 */
public class B extends A {
    public B() {
        super("jack"); // A 的构造函数: 可以通过参数列表决定调用哪个构造函数
        System.out.println("B is init");
    }


    public void eat() {
        super.show();
    }

    // 方法重写
    @Override
    public void show() {
        // 一些业务
        super.show();
        // 有一些业务
    }
}
