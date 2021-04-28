package com.iweb.Collection.TreeSetTest;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        return o1.getName().compareTo(o2.getName());
    }
}
