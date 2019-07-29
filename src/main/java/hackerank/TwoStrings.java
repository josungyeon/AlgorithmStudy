package hackerank;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 6. 6..
 */
public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Map<String, Integer> s1Map = new HashMap<>();
        Map<String, Integer> s2Map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(Character.toString(s1.charAt(i)), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            s2Map.put(Character.toString(s2.charAt(i)), 1);
        }

        for (Map.Entry map : s1Map.entrySet()) {
            Integer num = (Integer)map.getValue() - s2Map.getOrDefault(map.getKey(), 0);
            if (num == 0) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hi", "world"));
//        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hackerrankcommunity", "cdecdecdecde"));
    }
}
