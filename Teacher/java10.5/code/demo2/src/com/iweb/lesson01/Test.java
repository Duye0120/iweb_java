package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 10:35
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        // 获取当前线程的名称
        System.out.println("主线程:" + Thread.currentThread().getName());

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();

    }

}
