package kakao;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by sungyeon on 11/02/2019.
 */
public class AllSearchTest {
    @Test
    public void test() {
        int[] result = AllSearch.solution(new int[]{1,2,3,4,5});
//        int[] result = AllSearch.solution(new int[]{1,3,2,4,2});

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
