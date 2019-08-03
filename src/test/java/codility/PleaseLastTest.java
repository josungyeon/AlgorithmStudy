package codility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 8. 2..
 */
public class PleaseLastTest {
    @Test
    public void test1() {
        assertEquals(ReTestNum1.solution3(83643), "23h14m3s");
        assertEquals(ReTestNum1.solution3(7500), "2h5m0s");
        assertEquals(ReTestNum1.solution3(0), "0h0m0s");
        assertEquals(ReTestNum1.solution3(86399), "23h59m59s");
    }

    @Test
    public void test3() {
        assertEquals(ReTestNum3.solution(new int[]{3,4,3,0,2,2,3,0,0}), 5);
        assertEquals(ReTestNum3.solution(new int[]{4,4,3,3,1,0}), 3);
        assertEquals(ReTestNum3.solution(new int[]{4, 2, 0}), 0);
        assertEquals(ReTestNum3.solution(new int[]{1,2}), 1);
        assertEquals(ReTestNum3.solution(new int[]{0,0,0,3,4,5,6}), 3);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals(ReTestNum3.solution(array), 99999);
    }

    @Test
    public void test4() {
        assertEquals(ReTestNum4.solution(new int[]{}), 0);
        assertEquals(ReTestNum4.solution(new int[]{1, 1}), 1);
        assertEquals(ReTestNum4.solution(new int[]{-1000000000, -1000000000, -100000000, 1000000000}), 1);
        assertEquals(ReTestNum4.solution(new int[]{1000000000, 1000000000, 1000000000, 1000000000}), 6);
        assertEquals(ReTestNum4.solution(new int[]{3, 5, 6, 3, 3, 5}), 4);
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1000;
        }
        assertEquals(ReTestNum4.solution(array), 1000000000);
    }

    @Test
    public void test() {
        assertEquals(PleaseLast.solution4("011100"), 7);
        assertEquals(11, PleaseLast.solution4("10000000000"));
        assertEquals(0, PleaseLast.solution4("0"));
    }
}
