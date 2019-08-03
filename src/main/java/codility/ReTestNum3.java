package codility;

import java.util.Arrays;

/**
 * ex) 3, 4, 4, 0, 2, 2, 3, 0, 0 -> (0,2,6) 3명, (4, 5) 2명
 * Then, return 5
 *
 * Created by sungyeonjo on 2019. 8. 3..
 */
public class ReTestNum3 {
    public static int solution(int[] ranks) {
        int totalReporter = 0;
        int reporter = 0;
        Arrays.sort(ranks);

        for (int i = 0; i < ranks.length - 1; i++) {
            if (ranks[i] == ranks[i + 1]) {
                reporter++;
            } else if (ranks[i + 1] == ranks[i] + 1) {
                totalReporter += (reporter + 1);
                reporter = 0;
            } else {
                reporter = 0;
            }
        }
        return totalReporter;
    }
}
