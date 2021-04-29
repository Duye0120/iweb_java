package com.iweb.Thread.lesson05_join;

public class MyRunnable implements Runnable{
    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {

                try {
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
