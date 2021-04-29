package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 11:02
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {
        // 启动2个线程来执行任务
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "A");
        Thread t2 = new Thread(mr, "B");

        t1.start();
        t2.start();
    }

}
