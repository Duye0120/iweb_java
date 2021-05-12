package JavaTest;

public class halfSearch_2 {


    /**
     * 二分查找法
     * @param arr
     * @param key
     * @return
     */
    public static int test(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) >> 1; // (max+min) / 2
        while (arr[mid] != key) {
            if (key > arr[mid]){
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid -1;
            }
            if(max<min){
                return -1;
            }
            mid = (max + min) >> 1;
        }
        return mid;
    }
}


