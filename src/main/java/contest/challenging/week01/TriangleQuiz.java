package contest.challenging.week01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleQuiz {
    private static final int RANDOM_COUNT = 1000000;
    private static final int RANGE_MAX = 100;
    private static final int RANGE_MIN = 3;

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        for (int i1 = 1; i1 <= RANDOM_COUNT; i1++) {
			list1.add(i1);
		}

        Collections.shuffle(list1);

        List<Integer> list = list1;
        int n = (int) (Math.random() * (RANGE_MAX - RANGE_MIN)) + RANGE_MIN;

        List<Integer> arrVal1 = new ArrayList<Integer>();
        for (int i1 = 0; i1 < n; i1++) {
			arrVal1.add(i1, list.get(i1));
		}

        List<Integer> arrVal = arrVal1;
        Collections.sort(arrVal);
        Collections.reverse(arrVal);

        int round;
        int maxRound = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arrVal.get(i) < arrVal.get(j) + arrVal.get(k)) {
                        round = arrVal.get(i) + arrVal.get(j) + arrVal.get(k);

                        if (round > maxRound) {
                            maxRound = round;
                        }

                    }
                }
            }
        }

        printResult(n, arrVal, maxRound);
    }

    private static void printResult(int n, List<Integer> arrVal, int maxRound) {
        System.out.println("입력");
        System.out.println("n : " + n);
        System.out.println("a : " + arrVal);

        System.out.println("출력");
        System.out.println(maxRound);
    }
}
