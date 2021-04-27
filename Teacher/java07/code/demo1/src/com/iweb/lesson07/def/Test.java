package com.iweb.lesson07.def;


import com.iweb.lesson07.def.user.User;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 11:20
 * 描述: Test
 */
public class Test extends User {

    public void show() {
        System.out.println(name); // protected String name;
    }

    public static void main(String[] args) {

        User user = new User();
        // System.out.println(user.name);
    }
}
