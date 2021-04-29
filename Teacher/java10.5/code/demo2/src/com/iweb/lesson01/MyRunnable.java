package com.iweb.lesson01;

import java.util.Date;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 10:41
 * 描述: MyRunnable
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // TO DO 业务
        System.out.println("子线程：" + Thread.currentThread().getName() + ":" + new Date());
    }
}
