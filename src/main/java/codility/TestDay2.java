package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 7. 27..
 */
public class TestDay2 {
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

    public static int test2solution(int[] A) {
        int result = 1;
        String nextStatus;   //up, down, flat
        String currentStatus = "flat";

        for (int i = 0; i < A.length - 1; i++) {
            nextStatus = getStatus(A, i, currentStatus);

            if (!nextStatus.equals(currentStatus)) {
                result++;
            }

            currentStatus = nextStatus;

        }
        return result;
    }

    private static String getStatus(int[] A, int index, String prevStatus) {
        if (A[index] < A[index + 1]) {
            return "up";
        } else if (A[index] > A[index + 1]) {
            return "down";
        }

        return prevStatus;
    }

    public static int solution3(String S) {
        char[] array = S.toCharArray();

        if (array.length == 0) return 0;

        List<Integer> openBracketIndexList = extractIndex(array, '(');
        List<Integer> closeBracketIndexList = extractIndex(array, ')');

        if (openBracketIndexList.size() == 0 || closeBracketIndexList.size() == 0) {
            return closeBracketIndexList.size();
        }

        return findIndex(openBracketIndexList, closeBracketIndexList);
    }

    private static List<Integer> extractIndex(char[] array, char targetValue) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                list.add(i);
            }
        }

        return list;
    }

    private static int findIndex(List<Integer> openBracketIndexList, List<Integer> closeBracketIndexList) {
        int minSize = Math.min(openBracketIndexList.size(), closeBracketIndexList.size());
        int matchedIndex = 0;

        for (int i = 0; i < minSize; i++) {
            int closeIndex = closeBracketIndexList.get(closeBracketIndexList.size() - 1 - i);

            if (openBracketIndexList.get(i) > closeIndex) {
                break;
            }

            matchedIndex = closeIndex;
        }

        return matchedIndex;
    }

}
