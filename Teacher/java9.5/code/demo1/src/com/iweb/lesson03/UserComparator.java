package com.iweb.lesson03;

import java.util.Comparator;

/**
 * 作者: jack
 * 时间: 2021-04-28 0028 09:34
 * 描述: UserComparator
 */
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        return o1.getName().compareTo(o2.getName());
    }
}
