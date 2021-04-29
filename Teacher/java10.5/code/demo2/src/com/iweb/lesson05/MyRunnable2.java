package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 11:13
 * 描述: MyRunnable1
 */
public class MyRunnable2 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
