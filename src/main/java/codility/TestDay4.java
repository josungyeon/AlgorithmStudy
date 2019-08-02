package codility;

/**
 * ya Test4번, non-adjacent Total Min Sum 찾기
 * Created by sungyeonjo on 2019. 7. 29..
 */
public class TestDay4 {
    //before
    public static int test4solution(int[] A) {
        int minSum = A[1] + A[A.length - 2];
        for (int i = 1; i < A.length - 3; i++) {
            for (int j = i + 2; j < A.length - 1; j++) {
                int sum = A[i] + A[j];
                if (minSum > sum) {
                    minSum = sum;
                }
            }
        }
        return minSum;
    }

    // after.. 성능 조금 개선..
    public static int test4AnotherSolution(int[] A) {
        int minSum = A[1] + A[A.length - 2];

        for (int i = 1; i < (A.length/2) - 1; i++) {
            for (int j = A.length - 1 - i; i >= j - 1; j--) {
                minSum = getMinSum(A, i, j, minSum);
            }
        }
        return minSum;
    }

    private static int getMinSum(int[] A, int prevIndex, int endIndex, int lastMinSum) {
        int minSum = A[prevIndex] + A[endIndex];

        if (lastMinSum > minSum) {
            return minSum;
        }

        return lastMinSum;
    }
}
