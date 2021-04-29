package com.iweb.lesson03;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("123");
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("DDD");

        // 集合的大小
        System.out.println(linkedList.size());
        // 获取元素
        System.out.println(linkedList.get(0));
        // 删除
        System.out.println(linkedList.remove(0));
        // 特有的方法
        System.out.println(linkedList.getFirst());
        // 遍历for 增强for

        Iterator<Object> its = linkedList.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}
