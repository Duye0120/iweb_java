package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:09
 * 描述: UserService
 */
public class UserService implements Service, Server {
    @Override
    public void show() {
        System.out.println("user show");
    }

    @Override
    public void init() {
        System.out.println("user init");
    }
}
