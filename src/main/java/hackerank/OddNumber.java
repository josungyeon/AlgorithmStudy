package hackerank;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 6. 6..
 */
public class OddNumber {
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> res = oddNumbers(2, 5);

//        for (int i = 0; i < res.size(); i++) {
//            if (i != res.size() - 1) {
//            }
//        }

        System.out.println(res);
    }
}
