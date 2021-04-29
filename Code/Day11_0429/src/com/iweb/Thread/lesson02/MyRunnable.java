package com.iweb.Thread.lesson02;

import java.util.Date;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("子线程: " + Thread.currentThread().getName() + ": " + new Date());
    }
}
