package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 14:07
 * 描述: GoodRunnable
 */
public class GoodRunnable implements Runnable {

    private Good good;

    public GoodRunnable(Good good) {
        this.good = good;
    }

    @Override
    public void run() {
        good.change();
    }
}
