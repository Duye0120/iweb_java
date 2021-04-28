package com.iweb.lesson02;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:11
 * 描述: Test
 * TreeSet: 元素唯一, 底层是二叉树 (自然有序) 不能有 null
 */
public class Test {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        // compareTo()  比较大小
        set.add("D");
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");

        // set.add(null); // null.compareTo() => NullPointException

        Iterator<String> its = set.iterator();

        while (its.hasNext()) {
            System.out.println(its.next());
        }

    }

}
