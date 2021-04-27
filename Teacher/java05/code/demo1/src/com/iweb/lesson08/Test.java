package com.iweb.lesson08;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:15
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        // 重写后调用的是子类的功能
        son.playBall(); // 儿子继承了父类的功能： 代码复用的功能


    }
}
