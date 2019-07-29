package hackerrank;

import java.util.Arrays;

/**
 * Created by sungyeon on 07/06/2019.
 */
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // 4개
            min += arr[i];  // 0, 1, 2, 3
            max += arr[i + 1];  //1, 2, 3, 4
        }

        System.out.println(min + " " + max);

    }

    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }
}
