package kakao;

import java.util.*;

/**
 * Created by sungyeon on 11/02/2019.
 */
public class AllSearch {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int index = 0;

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] countResult = {0,0,0};

        // 1,2,3,4,5 반복하는거 짜기
        int[] newone = new int[answers.length];
        int[] newtwo = new int[answers.length];
        int[] newthree = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            newone[i] = one[i % one.length];
            newtwo[i] = two[i % two.length];
            newthree[i] = three[i % three.length];
        }

        for (int i = 0; i < answers.length; i++) {
            System.out.println(newone[i]);
            System.out.println(newtwo[i]);
            System.out.println(newthree[i]);
            System.out.println();
        }

        for (int i = 0; i < answers.length; i++) {
            if (newone[i] == answers[i]) countResult[0]++;
            else if (newtwo[i] == answers[i])  countResult[1]++;
            else if (newthree[i] == answers[i])  countResult[2]++;
        }

        // count1~3 대소비교
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (max <= countResult[i]) max = countResult[i];
        }

        for (int i = 0; i < countResult.length; i++) {
            System.out.println(countResult[i]);
        }
        System.out.println();


        System.out.println("max= " + max);
        List<Integer> result = new ArrayList<>();
        // max 값과 같은 것들 찾아서 배열에 넣는다
        for (int i = 0; i < 3; i++) {
            if (max == countResult[i]) {
                result.add(index, i + 1);
                index++;
            }
        }

        System.out.println(result);
        return answer;
    }
}
