package kakao;

import java.util.*;

/**
 * [6, 10, 2] -> "6210"
 * [3, 30, 34, 5, 9] -> "9534330"
 *
 * Created by sungyeon on 07/02/2019.
 */
public class MaxNumber2 {
    public String solution(int[] numbers) {
        StringBuilder builder;

        int maxNumber = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            builder = new StringBuilder();

            for (int j = 0; j < numbers.length; j++) {
                builder.append(numbers[j]);

                int tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
            }

            if (maxNumber < Integer.parseInt(builder.toString())) {
                maxNumber = Integer.parseInt(builder.toString());
            }
        }

        return Integer.toString(maxNumber);
    }

    public static void main(String[] args) {
        MaxNumber2 sut = new MaxNumber2();

        System.out.println(sut.solution(new int[]{6, 10, 2}));
        System.out.println();
        System.out.println(sut.solution(new int[]{3, 30, 34, 5, 9}));
    }
}
