package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 09:33
 * 描述: User
 */
public class User {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
        super.finalize();
    }
}
