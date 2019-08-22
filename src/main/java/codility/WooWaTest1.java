package codility;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sungyeonjo on 2019. 8. 21..
 */
public class WooWaTest1 {
    public String solution(int U, int L, int[] C) {
        int[] upperRow = new int[C.length];
        int[] lowerRow = new int[C.length];

        List<Integer> indexesToFill = new ArrayList<>();
        int upperSum = 0;
        int lowerSum = 0;

        for (int k = 0; k < C.length; k++) {
            if (C[k] == 2) {
                upperRow[k] = 1;
                lowerRow[k] = 1;
                upperSum++;
                lowerSum++;
            } else if (C[k] == 0) {
                upperRow[k] = 0;
                lowerRow[k] = 0;
            } else {
                upperRow[k] = -1;
                lowerRow[k] = -1;
                indexesToFill.add(k);
            }
        }

        if (indexesToFill.size() == 0) {
            return makeResult(upperRow, lowerRow);
        }

        int upperRemain = U - upperSum;
        int lowerRemain = L - lowerSum;

        if (upperRemain + lowerRemain == indexesToFill.size()) {
            for (int indexToFill : indexesToFill) {
                if (upperRemain > 0) {
                    upperRow[indexToFill] = 1;
                    lowerRow[indexToFill] = 0;
                    upperRemain--;
                } else if (lowerRemain > 0) {
                    upperRow[indexToFill] = 0;
                    lowerRow[indexToFill] = 1;
                    lowerRemain--;
                }
            }
            return makeResult(upperRow, lowerRow);
        }

        return "IMPOSSIBLE";
    }

    private String makeResult(int[] upperRow, int[] lowerRow) {
        String upper = Arrays.stream(upperRow)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        String lower = Arrays.stream(lowerRow)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        return upper + "," + lower;
    }


}
