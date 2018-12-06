package kakao;

import java.util.*;

/**
 * 후보키
 * Created by sungyeon on 05/12/2018.
 */
public class CandidateKey {
    public int solution(String[][] relation) {
        Set<String> noDupList = new HashSet<String>();
        int answer = 0;

        for (int i = 0; i < relation[i].length; i++) {
            for (int j = 0; j < relation.length; j++) {
                noDupList.add(relation[j][i]);
            }

            if (noDupList.size() == relation.length) {
                answer++;
            }
            noDupList.clear();
        }

        return answer;
    }
}
