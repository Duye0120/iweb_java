package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 14:08
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 使用3个线程同时对Good 中的 count 进行消费
        Good good = new Good();
        GoodRunnable gr = new GoodRunnable(good);

        Thread t1 = new Thread(gr);
        Thread t2 = new Thread(gr);
        Thread t3 = new Thread(gr);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(100); // 等待子线程执行完所有的任务
        System.out.println("剩余商品数量:" + good.getCount());

    }
}
