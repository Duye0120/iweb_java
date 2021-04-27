package com.iweb.lesson12;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 13:37
 * 描述: Test
 * 运行时多态
 */
public class Test {
    public static void main(String[] args) {

        // 声明父类
        Father father;

        // 指向子类的引用(对象) : 调用的是哪个重写的方法由引用的对象来决定
        father = new Son();
        father.say();
        father = new Daughter();
        father.say();

    }
}
