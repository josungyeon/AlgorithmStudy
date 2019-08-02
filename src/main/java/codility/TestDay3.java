package codility;

import java.util.ArrayList;
import java.util.List;

/**
 * (()) -> return 2
 * Created by sungyeon on 29/07/2019.
 */
public class TestDay3 {
    public static int solution(String S) {
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
