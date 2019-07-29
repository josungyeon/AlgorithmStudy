package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 4. 15..
 */
public class Solution {
    public int solution(int[] A) {
        int result = 0;
        int[] newArray = new int[A.length - 1];

        if (compareArray(Arrays.copyOf(A, A.length))) {
            return A.length;
        }

        //A[i]를 제외하고 array를 다시만들기
        for (int i = 0; i < A.length; i++) {
            System.arraycopy(A, 0, newArray, 0, i);
            System.arraycopy(A, i + 1, newArray, i, A.length - i - 1);


            for (int j = 0; j < newArray.length; j++) {
                System.out.println(newArray[j]);
            }
            if (compareArray(newArray)) {
                System.out.println("++");
                result++;
            }
            System.out.println("-----");

        }

        System.out.println(result);

        return result;
    }

    // a, b 동일한 리스트! a는 소팅 후에 b와 비교할 예정, true는 동일하다는것, count++
    boolean compareArray(int[] a) {
        int[] newB = Arrays.copyOf(a, a.length);

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println("aaa = " + a[i]);
            System.out.println("bbb = " + newB[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != newB[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sut = new Solution();
        sut.solution(new int[]{3,4,5,4}); // 2
//        sut.solution(new int[]{4,5,2,3,4}); //0
    }
}
