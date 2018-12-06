package kakao;

import java.util.*;

/**
 * 코딩테스트 연습 > 정렬 > K번째 수
 * Created by sungyeon on 06/12/2018.
 */
public class SortByKNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int first = commands[i][0];
            int last =  commands[i][1];

            answer[i] = getSortArray(array, first - 1, last - 1, commands[i][2] - 1);
        }

        return answer;
    }

    private int getSortArray(int[] array, int first, int last, int targetIndex) {
        int[] newArray = new int[last - first + 1];
        int index = 0;

        for (int i = first; i <= last; i++) {
            newArray[index] = array[i];
            index++;
        }

        Arrays.sort(newArray);

        return newArray[targetIndex];
    }
}
