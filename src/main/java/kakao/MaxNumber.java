package kakao;

import java.util.*;

/**
 * 정렬 > 가장 큰 수
 * Created by sungyeon on 07/12/2018.
 */
public class MaxNumber {
    public String solution(int[] numbers) {
        Set<String> setList = new HashSet<String>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0, z = 1; z < numbers.length; j++, z++) {
                int tmp = numbers[j];
                numbers[j] = numbers[z];
                numbers[z] = tmp;

                System.out.println(j + ", " + z);
                setList.add(getStringNumber(numbers));
            }
        }

        String answer = printMaxValue(setList);
        return answer;
    }

    private String getStringNumber(int[] numbers) {
        String summary = "";
        for (int number: numbers) {
            summary += number;
        }
        System.out.println("summary: " + summary);
        return summary;
    }

    private String printMaxValue(Set<String> lists) {
        int maxValue = 0;

        for (String value: lists) {
            if (maxValue < Integer.parseInt(value)) {
                maxValue = Integer.parseInt(value);
            }
        }
        return String.valueOf(maxValue);
    }
}
