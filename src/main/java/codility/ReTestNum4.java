package codility;

/**
 *  ex) 3 5 6 3 3 5 -> (0,3)(0,4)(1,5)(3,4)
 * Then, return 4;
 *
 * Created by sungyeonjo on 2019. 8. 3..
 */
public class ReTestNum4 {
    public static int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if ((A[i] == A[j]) && (i < j)) {
                    count++;
                }
            }

            if (count >= 1000000000) {
                count = 1000000000;
                break;
            }
        }
        return count;
    }
}
