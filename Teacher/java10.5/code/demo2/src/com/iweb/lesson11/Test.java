package com.iweb.lesson11;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 15:29
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        String lockA = "lockA";
        String lockB = "lockB";

        // 线程A
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println(Thread.currentThread().getName() + "获取" + lockA);
                    synchronized (lockB) {
                        System.out.println(Thread.currentThread().getName() + "获取" + lockB);
                    }
                }
            }
        }, "A");

        // 线程B
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println(Thread.currentThread().getName() + "获取" + lockB);
                    synchronized (lockA) {
                        System.out.println(Thread.currentThread().getName() + "获取" + lockA);
                    }
                }
            }
        }, "B");

        // 启动线程
        a.start();
        b.start();

    }
}
