package com.iweb.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedListInAdd {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int N=100;
        long arrayListResult=0;
        long linkListResult=0;
        for(int j=0;j<N;j++){
            List<Integer> arrayList=new ArrayList<>();
            Random random=new Random();
            long start=System.currentTimeMillis();
            for(int i=0;i<1000000;i++){
                arrayList.add(random.nextInt());
            }
            long end=System.currentTimeMillis();
            arrayListResult+=end-start;
        }
        for(int j=0;j<N;j++){
            List<Integer> arrayList=new LinkedList<>();
            Random random=new Random();
            long start=System.currentTimeMillis();
            for(int i=0;i<1000000;i++){
                arrayList.add(random.nextInt());
            }
            long end=System.currentTimeMillis();
            linkListResult+=end-start;
        }
        System.out.printf("ArrayList平均耗时：%s\n",arrayListResult/N);
        System.out.printf("LinkedList平均耗时：%s",linkListResult/N);
    }
}
