package com.iweb.lesson03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:33
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        // TreeSet<User> users = new TreeSet<>(new UserComparator());

        // 匿名内部类
        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getId() > o2.getId()) return 1;
                if (o1.getId() < o2.getId()) return -1;
                return o1.getName().compareTo(o2.getName());
            }
        });

        users.add(new User(1, "jack"));
        users.add(new User(2, "tom"));

        System.out.println(users);

    }
}
