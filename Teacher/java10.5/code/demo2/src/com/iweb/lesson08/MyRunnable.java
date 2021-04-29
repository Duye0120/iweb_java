package com.iweb.lesson08;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 13:45
 * 描述: MyRunnable
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName()
                        + "父线程组:"
                        + Thread.currentThread().getThreadGroup().getName()
                        + "祖父线程组:" + Thread.currentThread().getThreadGroup().getParent().getName()
        );
    }
}
