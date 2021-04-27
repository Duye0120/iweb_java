package com.iweb.lesson03;

import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 09:22
 * 描述: Test2
 */
public class Test2 {

    public void changeArr(int[] arr) {
        System.out.println("before:" + Arrays.toString(arr));
        arr[0] = 10;
        System.out.println("after:" + Arrays.toString(arr));

    }


    public static void main(String[] args) {

        Test2 t2 = new Test2();

        int[] arr = {1, 2, 3};

        t2.changeArr(arr);
        System.out.println(Arrays.toString(arr)); // 数组的元素被 change 改变了
    }
}
