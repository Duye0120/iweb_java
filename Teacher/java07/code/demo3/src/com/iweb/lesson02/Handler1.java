package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:29
 * 描述: Handler1
 */
public class Handler1 implements Handler {
    @Override
    public void before() {
        System.out.println("确认手机");
    }

    @Override
    public void run() {
        System.out.println("汽车");
    }

    @Override
    public void buy() {
        System.out.println("大洋");
    }
}
