package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 13:45
 * 描述: MyRunnable
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
