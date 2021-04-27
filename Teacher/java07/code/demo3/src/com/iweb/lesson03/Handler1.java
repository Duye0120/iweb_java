package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:33
 * 描述: Handler1
 */
public class Handler1 extends Before implements Buy, Run {
    @Override
    public void buy() {
        System.out.println("大洋买东西");
    }

    @Override
    public void run() {
        System.out.println("坐地铁");
    }
}
