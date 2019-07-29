package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 7. 29..
 */
public class TestDemo {
    public static int demo(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }

        Integer maxNum = Collections.max(list);

        if (maxNum < 0) return 1;

        Arrays.sort(A);

        int minNum = A[0];
        for (int i = 1; i < A.length; i++) {
            if (minNum + 1 < A[i]) {
                minNum += 1;
            } else {
                minNum = A[i];
            }
        }

        if (minNum == A[A.length - 1]) return A[A.length - 1] + 1;
        else return minNum;
    }

    static boolean compareArray(int[] arr) {
        int[] arrClone = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrClone[i]) {
                return false;
            }
        }
        return true;
    }

    public static int nTree(int[] a) {
        int result = 0;

        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a, 0, b, 0, i);
            System.arraycopy(a, i + 1, b, i, a.length - 1 - i);

            if (compareArray(b)) {
                result++;
            }
        }
//        System.arraycopy(a, 0, b, 0, 1);
//        System.arraycopy(a, 2, b, 1, 2);

        System.out.println("result=" + result);

        return result;
    }

    static public int maxArrayNumber(int[] b) {
        int maxNum = 0;
        int negativeCnt = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                maxNum += b[i];
            } else if (b[i] < 0 && maxNum != 0) {
                list.add(maxNum);
                maxNum = 0;
            } else if (b[i] < 0) {
                negativeCnt++;
            }

            if ((i == b.length - 1) && (b[i] > 0)) {
                list.add(maxNum);
            }
        }

        int max = 0;
        for (Integer a : list) {
            if (max < a) max = a;
        }

        if (negativeCnt == b.length) return -1;

        return max;
    }

    static public int evenMaxNum() {
        int[] a = {-6, -91, 1011, -100, 84, -22, 0, 1, 473}; // 84
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2 == 0) && (max < a[i])) {
                max = a[i];
            }
        }
        System.out.println(max);

        return max;
    }

    static public int rectangularMapTest(int[][] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (((j<a[i].length - 1)&&(a[i][j] == a[i][j+1])) || ((i<a.length-1)&&(a[i][j] == a[i+1][j]))) {
                    // pass!
                } else if (((i > 0)&&(a[i][j] == a[i-1][j])) || ((j>0)&&(a[i][j] == a[i][j-1]))) {
                    result++;
                } else { // 같은 숫자가 없을 경우
                    result++;
                }
            }
        }

        return result;
    }

}
