package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 10:56
 * 描述: MyThread
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
