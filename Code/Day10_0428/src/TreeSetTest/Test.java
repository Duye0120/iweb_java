package TreeSetTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 元素唯一，底层是二叉树（自然有序）不能有null
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // compareTo()
        set.add("D");
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");

        Iterator<String> its = set.iterator();
        while (its.hasNext()){
            System.out.println(its.next());//  ABCD
        }


        TreeSet<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getId() > o2.getId()) return 1;
                if (o1.getId() < o2.getId()) return -1;
                return o1.getName().compareTo(o2.getName());
            }
        });

        users.add(new User(1,"jack"));
        users.add(new User(2,"tom"));
        System.out.println(users);
    }
}
