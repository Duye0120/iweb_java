package com.iweb.Thread.lesson04_yield;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
           Thread.yield();
        }

    }
}
