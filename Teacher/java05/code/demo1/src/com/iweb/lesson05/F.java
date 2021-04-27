package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:35
 * 描述: F : 父类
 */
public class F {

    private String word = "F"; // 私有的子类不能直接访问
    int number = 100; // 子类可以访问

    // 子类可以访问
    public void show() {
        System.out.println("F is show");
    }

}
