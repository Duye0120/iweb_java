package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 11:13
 * 描述: MyRunnable1
 */
public class MyRunnable1 implements Runnable {

    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        // 当执行 i = 3 的时候 加入一个线程
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                try {
                    // 加入线程
                    thread.start();
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
