package com.iweb.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayListVsLinkedListInSelect {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int N = 10;
        long arrayListResult = 0;
        long linkedListResult = 0;
        for (int j = 0; j < N; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 100000; i++) {
                arrayList.add(random.nextInt());
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                int a = arrayList.get(random.nextInt(100000));
            }
            long end = System.currentTimeMillis();
            //System.err.println("总耗时:"+(end-start)+"ms");
            arrayListResult += end - start;
        }
        for (int i = 0; i < N; i++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            Random random = new Random();
            for (int j = 0; j < 100000; j++) {
                linkedList.add(random.nextInt());
            }
            long start = System.currentTimeMillis();
            for (int j = 0; j < 50000; j++) {
                int a = linkedList.get(random.nextInt(100000));
            }
            long end = System.currentTimeMillis();
            //System.err.println("总耗时:"+(end-start)+"ms");
            linkedListResult += end - start;
        }
        System.err.println("平均耗时:" + arrayListResult / N + "ms");
        System.err.println("平均耗时:" + linkedListResult / N + "ms");
    }
}
