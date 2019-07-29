package kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 프로그래머스 H-Index 문제
 *
 * Created by sungyeon on 07/02/2019.
 */
public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int pivot = citations.length / 2;

        int h = citations[pivot];

//        int count = 0;
//        for (int i = h; i < count; i++) {
//
//            for (int j= 0; j < citations.length; j++) {
//                if (citations[j] >= i) count++;
//            }
//
//            if (i >= count) return i;
//        }

        int max = 0;

        for (int i = citations.length - 1; i > -1; i--) {
            int min = Math.min(citations[i], citations.length - 1);
            if (max < min) max = min;
        }

        return h;
    }

    public static void main(String[] args) {
        HIndex index = new HIndex();

//        int result = index.solution(new int[]{3, 0, 6, 1, 5});
//        System.out.println(result);

        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"eden", "kiki", "leo"};

        System.out.println(index.solution(participant, completion));
    }

    // 완주하지 못한 선수
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> partMap = new HashMap<>();

        for (String part: participant) {
            partMap.put(part, partMap.getOrDefault(part, 0) + 1);
        }

        for (String comp: completion) {
            partMap.put(comp, partMap.get(comp) - 1);
        }

        for (Map.Entry<String, Integer> result: partMap.entrySet()) {
            if (result.getValue() != 0) {
                answer = result.getKey();
            }
        }

        return answer;
    }
}
