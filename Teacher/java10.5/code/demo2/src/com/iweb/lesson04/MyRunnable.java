package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 11:03
 * 描述: MyRunnable
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
