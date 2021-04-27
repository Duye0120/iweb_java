package com.iweb.lesson03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 作者: jack
 * 时间: 2021-04-27 0027 10:42
 * 描述: LinkedListTest
 * 底层是 双向链表 有序的可以有重复元素（List）
 * 1. 查询慢、增删快
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("123");
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("DDD");

        // 集合的大小
        System.out.println(linkedList.size());

        // 获取元素
        System.out.println(linkedList.get(0));

        // 删除
        // System.out.println(linkedList.remove(0));

        // 特有的方法
        System.out.println(linkedList.getFirst());

        // 遍历 for  增强for

        Iterator<String> its = linkedList.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }


    }

}
