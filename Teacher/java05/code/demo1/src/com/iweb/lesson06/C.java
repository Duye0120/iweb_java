package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:43
 * 描述: C : 间接继承了 A
 */
public class C extends B {

    public C() {
        super(); // 一定是第一行
        System.out.println("C is init");
    }

}
