package Demo02;

import java.util.Arrays;

public class SelectSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 找到最小书和最小数的位置
            int min = arr[i];
            int pos = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            // 将最小数和i位置的数进行交换
            if (pos == i) continue;
            arr[pos] = arr[i];
            arr[i] = min;

        }
    }

    public static void main(String[] args) {
        int[] arr = {11,11,23,98,71,49,63,12,31,12};
        SelectSort sort = new SelectSort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
