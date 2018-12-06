package kakao;

import java.util.*;

/**
 * Created by sungyeon on 2018. 11. 6..
 * Kakao 실패율 solution
 *
 * N	stages	                    result
 * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
 */
public class FailRate {

    public int[] solution(int N, int[] stages) {
        double total = stages.length;
        List<Double> failRate = new ArrayList<Double>();

        for (int i = 1; i <= N; i++) {
            int count = 0;

            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    count++;
                }
            }

            if (count == 0 && total == 0) {
                failRate.add(0.0);
            } else {
                double divided = count / total;
                failRate.add(divided);
                total -= count;
            }
        }

        Map<Integer, Double> map = new HashMap<Integer, Double>();
        for (int i = 0; i < failRate.size(); i++) {
            map.put(i + 1, failRate.get(i));
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;
            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }


        return answer;
    }
}
