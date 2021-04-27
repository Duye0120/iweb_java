package com.iweb.lesson04;

import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 11:18
 * 描述: SelectSort
 * 稳定性： 待排数组中 2个相同数据排序后和排序前的位置不变这就是稳定的,可能发生改变那就是不稳定的
 * 冒泡： 稳定的
 * 选择：不稳定的 5 8 5 2 9
 */
public class SelectSort {

    String name = "jack";

    public void sort(int[] arr) {
        // 选择多少次
        for (int i = 0; i < arr.length - 1; i++) { // i 待排数组的头部
            int min = arr[i];
            int pos = i;
            // 找到最小数 min 和 最小数 的位置 pos
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            // 将最小数和  i 位置的数进行交换
            if (pos == i) continue;
            arr[pos] = arr[i];
            arr[i] = min;
        }

    }

    public static void main(String[] args) {

        // 5 8 5 2 9  : 不稳定
        int[] arr = {11, 11, 23, 98, 71, 49, 63, 12, 31, 12};
        SelectSort sort = new SelectSort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
