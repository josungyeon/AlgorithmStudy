package kakao;

import java.util.*;

/**
 * 해시 > 완주하지 못한 선수
 * Created by sungyeon on 07/12/2018.
 */
public class Runner {
    public String solution(String[] participant, String[] completion) {

        List<String> completionList = Arrays.asList(completion);
        String answer = "";

        for (int i = 0; i < participant.length; i++) {

            if (!completionList.contains(participant[i])) {
                answer = participant[i];

            } else {
                System.out.println(participant[i]);
            }
        }

        return answer;
    }
}
