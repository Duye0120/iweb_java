package com.iweb.lesson01;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 08:48
 * 描述: Test
 * 特征：
 * 底层是hashcode
 * 如何判定是重复元素： 1. 比较hashcode,如果不同则保存  2. 如果hashcode相同则调用 equals方法
 */
public class Test {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // 添加元素
        set.add("A");
        set.add(null);
        set.add("admin");
        set.add("jack");
        set.add("admin");
        set.add("123");

        // 大小
        int size = set.size();
        System.out.println(size);

        // set 没有 get(index); 不能查询指定的元素

        set.remove("A"); // 通过值进行删除
        System.out.println(set.size());

        System.out.println("----------------------");
        // 遍历 ： fori 循环????
        for (String e : set) {
            System.out.println(e);
        }

        System.out.println("---------------------");
        // 迭代
        Iterator<String> its = set.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }


    }

}
