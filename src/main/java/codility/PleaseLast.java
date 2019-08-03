package codility;

import java.util.Arrays;

/**
 * 1. ex) 3 5 6 3 3 5 -> (0,3)(0,4)(1,5)(3,4)
 * Then, return 4;
 *
 * 2. ex) 3, 4, 4, 0, 2, 2, 3, 0, 0 -> (0,2,6) 3명, (4, 5) 2명
 * Then, return 5
 *
 * 3. ex) T = 7500 Then return "2h5m0s"
 *        T = 83643 Then return "23h14m3s"
 * Created by sungyeonjo on 2019. 8. 2..
 */
public class PleaseLast {
    public static int solution(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if ((i != j) && (a[i] == a[j]) && (i < j)) {
                    System.out.println(i + ", " + j);
                    count++;
                }
            }
        }

        return count;
    }

    public static int solution2(int[] ranks) {
        if (ranks.length == 0) return 0;

        int resultCount = 0;
        int count = 0;
        Arrays.sort(ranks);

        for (int i = 0; i < ranks.length - 1; i++) {
            if (ranks[i] == ranks[i + 1]) {
                count++;
            } else if (ranks[i + 1] == ranks[i] + 1) {
                resultCount += (count + 1);
                count = 0;
            } else {
                count = 0;
            }
        }
        return resultCount;
    }

    public static String solution3(int T) {
        StringBuilder stringBuilder = new StringBuilder();
        int rest = 0;

        if (T >= 3600) {
            int hour = T / 3600;
            stringBuilder.append(hour);
            stringBuilder.append("h");
            rest = T - (hour * 3600);
        }

        if (rest != 0) {
            int minute = rest / 60;
            stringBuilder.append(minute);
            stringBuilder.append("m");
            rest = rest - (60 * minute);
        }

        if (rest != 0) {
            int second = rest;
            stringBuilder.append(second);
            stringBuilder.append("s");
        } else {
            stringBuilder.append("0s");
        }

        return stringBuilder.toString();
    }

    public static int solution4(String s) {
        int num = Integer.parseInt(s, 2);
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 != 0) {
                num -= 1;
            }
            steps++;
        }

        return steps;
    }
}
