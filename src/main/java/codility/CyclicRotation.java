package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 4. 13..
 */
public class CyclicRotation {
    public String solution(int[] T) {
        int month = T.length / 4;
        List<Integer> winter = new ArrayList<>();
        List<Integer> spring = new ArrayList<>();
        List<Integer> summer = new ArrayList<>();
        List<Integer> autumn = new ArrayList<>();

        for (int i = 0; i < month; i++) {
            winter.add(T[i]);
            spring.add(T[i+month]);
            summer.add(T[i+month*2]);
            autumn.add(T[i+month*3]);
        }

        Map<String, Integer> fourSeasonsMap = new HashMap<>();
        fourSeasonsMap.put("WINTER", Collections.max(winter) - Collections.min(winter));
        fourSeasonsMap.put("SPRING", Collections.max(spring) - Collections.min(spring));
        fourSeasonsMap.put("SUMMER", Collections.max(summer) - Collections.min(summer));
        fourSeasonsMap.put("AUTUMN", Collections.max(autumn) - Collections.min(autumn));

        int max = Collections.max(winter) - Collections.min(winter);
        String season = "";

        for (Map.Entry map: fourSeasonsMap.entrySet()) {
            if (max < (int)map.getValue()) {
                max = (int)map.getValue();
                season = (String)map.getKey();
            }
        }

        return season;
    }

    public static void main(String[] args) {
        CyclicRotation sut = new CyclicRotation();
        sut.solution(new int[]{-3, -14, -5, 7, 8, 42, 8, 2});
    }
}
