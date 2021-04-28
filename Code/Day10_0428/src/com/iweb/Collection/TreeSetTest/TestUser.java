package com.iweb.Collection.TreeSetTest;

import java.util.TreeSet;

public class TestUser {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new User(1,"jack"));
        treeSet.add(new User(2,"tom"));

        System.out.println(treeSet);
    }
}
