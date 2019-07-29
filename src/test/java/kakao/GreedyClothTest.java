package kakao;

import org.junit.Test;

/**
 * Created by sungyeonjo on 2019. 2. 10..
 */
public class GreedyClothTest {

    @Test
    public void test() {
//        int[] array = GreedyCloth.getChangedArray(new int[]{1,3,5}, 1);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        int result = GreedyCloth.solution(5, new int[]{2,4}, new int[]{1,3,5});
        System.out.println("result = " + result);
    }
}
