package com.iweb.lesson02;

import java.util.TreeSet;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:23
 * 描述: TreeSetUser
 */
public class TreeSetUser {
    public static void main(String[] args) {

        TreeSet<User> treeSet = new TreeSet<>();

        //java.lang.ClassCastException: com.iweb.lesson02.User cannot be cast to java.lang.Comparable
        treeSet.add(new User(1, "jack"));
        treeSet.add(new User(2, "tom"));

        System.out.println(treeSet);

    }
}
