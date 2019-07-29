package hackerrank;

import java.util.*;
/**
 * k 코딩테스트 , 해커랭크 2번 문제
 *
 * Created by sungyeon on 10/06/2019.
 */
public class Test2 {
    public static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        List<Integer> priorities = new ArrayList<>();

        return priorities;
    }

    public static void main(String[] args) {
        List<Integer> issuePriorities = new ArrayList<>();
        issuePriorities.add(2);
        issuePriorities.add(9);
        issuePriorities.add(3);
        issuePriorities.add(2);
        issuePriorities.add(3);

        // then return 1,3,2,1,2
        System.out.println(reassignedPriorities(issuePriorities));
    }
}
