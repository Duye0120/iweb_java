package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 09:38
 * 描述: Test4
 */
public class Test4 {

    public void change(User user) {
        user.name = "tom";
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();

        User user = new User();
        user.name = "jack";

        t4.change(user);

        System.out.println(user.name );//
    }
}
