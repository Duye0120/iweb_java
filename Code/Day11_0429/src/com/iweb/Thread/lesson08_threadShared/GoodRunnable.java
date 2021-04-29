package com.iweb.Thread.lesson08_threadShared;

public class GoodRunnable implements Runnable{
    private Good good;

    public GoodRunnable(Good good) {
        this.good = good;
    }

    @Override
    public void run() {
        good.change();
    }
}
