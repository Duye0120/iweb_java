package com.iweb.Thread.lesson01;

import java.util.Date;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.class.getName()+ ": " + new Date());
    }
}
