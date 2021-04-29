package Demo02;

import java.util.Arrays;

public class Test2 {
    public void changeArr(int[] arr) {
        System.out.println("before:" + Arrays.toString(arr));
        arr[0] = 10;
        System.out.println("after:" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] arr = {1,2,3};
        test2.changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
