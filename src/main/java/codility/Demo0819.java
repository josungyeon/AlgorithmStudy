package codility;

import java.util.*;

/**
 * A =  [1, 3, 6, 4, 1, 2], the function should return 5.
 * 결과 : 55% , Need upgrade correctness
 * Created by sungyeonjo on 2019. 8. 19..
 */
public class Demo0819 {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] < 0) {
            return 1;
        }
        if (A.length == 1) {
            return A[0] + 1;
        }

        int currentMax = A[0];
        for (int i = 1; i < A.length; i++) {
            if (currentMax < 0) {
                currentMax = 1;
            } else {
                if (currentMax + 1 < A[i]) {
                    currentMax += 1;
                    break;
                } else {
                    currentMax = A[i];
                }
            }

            if (i == A.length - 1) {
                currentMax = currentMax + 1;
            }
        }

        return currentMax;
    }
}
