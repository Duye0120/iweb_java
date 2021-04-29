package com.iweb.lesson10;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 14:46
 * 描述: MyRunnable
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "进入了线程");
        synchronized ("lockA") {
            System.out.println(Thread.currentThread().getName() + "拿到了锁");
            try {
                Thread.sleep(2000); // 释放的是CPU
                System.out.println("2S 过去了 ");
                "lockA".wait(); // 释放锁
                Thread.sleep(2000); // 释放的是CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "释放锁");
        }
    }
}
