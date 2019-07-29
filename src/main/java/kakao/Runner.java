package kakao;

import java.util.*;

/**
 * 해시 > 완주하지 못한 선수
 * Created by sungyeon on 07/12/2018.
 */
public class Runner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();

        for (String player: participant) hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
        for (String player: completion) hashMap.put(player, hashMap.get(player) -1);

        for (String keySet : hashMap.keySet()) {
            if (hashMap.get(keySet) != 0) {
                answer = keySet;
            }
        }
        return answer;
    }
}
