package hackerank;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 6. 6..
 */
public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();

        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aScore += 1;
            } else if (a.get(i) < b.get(i)) {
                bScore += 1;
            }
        }

        result.add(aScore);
        result.add(bScore);

        return result;
    }

    public static void main(String[] args) {
//        List<Integer> aList = Arrays.asList(5, 6, 7);
//        List<Integer> bList = Arrays.asList(3, 6, 10);

        List<Integer> aList = Arrays.asList(17, 28, 30);
        List<Integer> bList = Arrays.asList(99, 16, 8);

        System.out.println(compareTriplets(aList, bList));
    }
}
