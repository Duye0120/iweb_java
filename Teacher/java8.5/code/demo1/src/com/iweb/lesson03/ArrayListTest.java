package com.iweb.lesson03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 作者: jack
 * 时间: 2021-04-27 0027 09:49
 * 描述: ArrayListTest
 * 底层结构是数组 ：
 * 1. 容器的初始化容量是 10 , 如果容量不够的清空下 增长 50%
 * 2. 底层是数据, 增删比较慢, 查询比较快
 */
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        // 添加元素
        list.add(100);
        list.add("hello");
        list.add(new User(1, "jack", 20));

        // 根据索引查看元素
        User user = (User) list.get(2);
        System.out.println(user);

        // 插入元素
        list.add(0, 200);
        System.out.println(list.get(0));

        // 删除元素
        Object remove = list.remove(0);
        System.out.println(remove);

        // list.size() 集合中元素的个数
        // 遍历
        /*1. fori*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");

        /*2. 增强for : 只能遍历不能修改*/
        for (Object e : list) { // e 指向集合中的元素
            System.out.println(e);
        }

        System.out.println("------------------");
        /*3. 迭代器： 只有集合才有，只能遍历又能修改*/
        Iterator its = list.iterator();

        while (its.hasNext()) {
            Object next = its.next(); // next() 一旦执行 当前指向就断开
            System.out.println(next);
        }

        /*使用泛型（可以理解为在集合容器上面设定一个标签）: 指定了当前的list中只能存放 String*/
        ArrayList<String> strs = new ArrayList<>();

        strs.add("100");
        // strs.add(200); // 只能存放 string 否则语法报错

        String str = strs.get(0); // 因为指定了泛型, 所以集合中的元素都是 string

    }

}
