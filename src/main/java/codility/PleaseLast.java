package codility;

import java.util.Arrays;

/**
 * Created by sungyeonjo on 2019. 8. 2..
 */
public class PleaseLast {
    public static int solution(String s) {
        int num = Integer.parseInt(s, 2);
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }

        return steps;
    }

    public int demoSolution(int[] A) {
        Arrays.sort(A);
        int num = A[0];

        if (num <= 0) return 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 2 <= A[i+1]) {

            }
            if (num < A[i]) {

            } else {
                num = A[i];
            }
        }
        return num;
    }
}
