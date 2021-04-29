package com.iweb.lesson04;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        // add添加方法
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        // 删除元素
        strings.remove(0);
        // 获取元素
        strings.get(0);
        //遍历
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
