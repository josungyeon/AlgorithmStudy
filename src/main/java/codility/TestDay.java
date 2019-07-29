package codility;

import java.util.*;

/**
 * ya Test 1번 String append 및 출력 문제
 * @author sungyeonjo
 */
public class TestDay {

    public static void solution(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i % 2 == 0) {
                stringBuilder.append("Codility");
            }

            if (i % 3 == 0) {
                stringBuilder.append("Test");
            }

            if (i % 5 == 0) {
                stringBuilder.append("Coders");
            }

            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
