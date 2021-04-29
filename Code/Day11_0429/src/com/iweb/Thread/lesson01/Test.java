package com.iweb.Thread.lesson01;

import java.sql.DatabaseMetaData;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println("主线程：" + Thread.currentThread().getName());
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }
}
