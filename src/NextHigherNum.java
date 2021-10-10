import utils.NumberUtils;

import java.util.Arrays;

public class NextHigherNum {

    static int[] findNext(int[] arr) {
        int len = arr.length;
        int i = 0;
        for (i = len - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break; // pivot found
            }
        }
        if(i != 0) {
            int x = arr[i - 1];
            int min = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[j] > x && arr[j] < arr[min]) {
                    min = j;
                }
            }
            NumberUtils.swap(arr, i - 1, min);
            //Arrays.toString(arr);
            Arrays.sort(arr, i, len); // TODO: check perf
            //Arrays.toString(arr);
        } else {
            System.out.println("Already highest");
            return null;
        }
        return arr;
    }
}