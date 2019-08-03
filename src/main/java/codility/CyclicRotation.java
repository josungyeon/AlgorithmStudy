package codility;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 4. 13..
 */
public class CyclicRotation {
    // * 2번
    public static String solution(int[] T) {
        int monthsPerSeason = T.length / 4;
        List<Integer> winter = new ArrayList<>();
        List<Integer> spring = new ArrayList<>();
        List<Integer> summer = new ArrayList<>();
        List<Integer> autumn = new ArrayList<>();

        for (int i = 0; i < monthsPerSeason; i++) {
            winter.add(T[i]);
            spring.add(T[i + monthsPerSeason]);
            summer.add(T[i + monthsPerSeason * 2]);
            autumn.add(T[i + monthsPerSeason * 3]);
        }

        Map<String, Integer> fourSeasonsTemperatureGap = new HashMap<>();
        fourSeasonsTemperatureGap.put("WINTER", Collections.max(winter) - Collections.min(winter));
        fourSeasonsTemperatureGap.put("SPRING", Collections.max(spring) - Collections.min(spring));
        fourSeasonsTemperatureGap.put("SUMMER", Collections.max(summer) - Collections.min(summer));
        fourSeasonsTemperatureGap.put("AUTUMN", Collections.max(autumn) - Collections.min(autumn));

        String season = "";
        int maxTempGap = 0;
        for (Map.Entry<String, Integer> map: fourSeasonsTemperatureGap.entrySet()) {
            if (maxTempGap <= map.getValue()) {
                maxTempGap = map.getValue();
                season = map.getKey();
            }
        }
        return season;
    }

}
