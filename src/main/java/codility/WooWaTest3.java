package codility;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by sungyeonjo on 2019. 8. 21..
 */
public class WooWaTest3 {
//    public int solution(int[] A) {
//        int length = A.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < length; i++) {
//            if (A[i] < 0) {
//                // 음수일 경우, Math.abs(A[i]) 와 비교해서 더 작은 값으로 넣기
//                int count = map.getOrDefault(Math.abs(A[i]), 0);
//                int negativeCount = map.getOrDefault()
//                map.put(Math.abs(A[i]), map.getOrDefault(Math.abs(A[i]), 0) + 1);
//            } else {
//                map.put(A[i], map.getOrDefault(A[i], 0) + 1);
//            }
////            map.put(Math.abs(A[i]), map.getOrDefault(Math.abs(A[i]), 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> resultMap : map.entrySet()) {
//            if (resultMap.getKey() < 0) {
//                //음수일 경우, 양수인 값을 찾아서 더 작은 값으로 셋팅해줌
//                map.getOrDefault(Math.abs(resultMap.getKey()), 0);
//            }
//        }
//
//        int maxValue = 0;
//        int maxKey = 0;
//        System.out.println(map);
//        for (Map.Entry<Integer, Integer> resultMap : map.entrySet()) {
//            if (maxKey <= resultMap.getKey() && maxValue <= resultMap.getValue() && (resultMap.getValue() % 2 == 0 || resultMap.getValue() >= 2)) {
//                maxValue = resultMap.getValue();
//                maxKey = resultMap.getKey();
//            }
//        }
//        return maxKey;
//    }
//
    public int solution(int[] A) {
        int[] sortedArr = IntStream.of(A)
                .boxed()
                .sorted()
                .mapToInt(i -> i)
                .distinct()
                .toArray();

        for (int i = sortedArr.length - 1; i >= 0; i--) {
            if (sortedArr[i] < 0)
                break;

            for (int j = 0; j < i; j++) {
                if (sortedArr[j] < 0 && sortedArr[i] == (-1) * sortedArr[j])
                    return sortedArr[i];
                break;
            }
        }
        return 0;
    }

}
