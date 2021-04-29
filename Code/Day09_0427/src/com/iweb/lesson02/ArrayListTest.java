package com.iweb.lesson02;

/*
 * 泛型:
 * 1. 只能是引用数据类型
 * 2. 泛型在使用的时候指定的属性类型,就是后饮用的数据类型
 */

import com.iweb.lesson01.JavaBeanTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList
 * 底层结构是数组:
 * 1. 底层的初始化容量是10 如果容量不够的情况下 增长50%
 * 2. 底层是数据,增删比较慢,查询比较快
 */
public class ArrayListTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // 添加元素
        list.add(100);
        list.add("hello");
        list.add(new JavaBeanTest(1, "jack", 20));

        // 根据索引值查看元素
        JavaBeanTest user = (JavaBeanTest) list.get(2);
        System.out.println(user);

        // 插入元素
        list.add(0, 200);
        System.out.println(list.get(0));

        // 删除元素
        Object remove = list.remove(0);
        System.out.println(remove);
        // list.size() 集合元素的个数
        // 遍历
        // fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------");
        /*增强for: 只能遍历不能修改*/
        for (Object e :
                list) {
            System.out.println(e);
        }

        // 3. 迭代器:只有集合才有,既能遍历也能修改
        Iterator its = list.iterator();
        while (its.hasNext()) {
            Object next = its.next();
            System.out.println(next);
        }
        // 使用泛型(可以理解为在集合容器上设定一个标签):指定了当前的list中只能被存放String
        ArrayList<String> strings = new ArrayList<>();
        strings.add("100");
//        strings.add(100);  只能存放String 否则语法报报错
        String str = strings.get(0);// 因为指定了泛型，所有集合中的元素都是String


    }
}
