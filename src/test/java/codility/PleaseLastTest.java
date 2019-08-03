package codility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 8. 2..
 */
public class PleaseLastTest {
    @Test
    public void test1() {
        assertEquals("23h14m3s", ReTestNum1.solution3(83643));
        assertEquals("2h5m0s", ReTestNum1.solution3(7500));
        assertEquals("0h0m0s", ReTestNum1.solution3(0));
        assertEquals("23h59m59s", ReTestNum1.solution3(86399));
    }

    @Test
    public void test3() {
        assertEquals(5, ReTestNum3.solution(new int[]{3,4,3,0,2,2,3,0,0}));
        assertEquals(3, ReTestNum3.solution(new int[]{4,4,3,3,1,0}));
        assertEquals(0, ReTestNum3.solution(new int[]{4, 2, 0}));
        assertEquals(1, ReTestNum3.solution(new int[]{1,2}));
        assertEquals(3, ReTestNum3.solution(new int[]{0,0,0,3,4,5,6}));
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals(99999, ReTestNum3.solution(array));
    }

    @Test
    public void test4() {
        assertEquals(0, ReTestNum4.solution(new int[]{}));
        assertEquals(1, ReTestNum4.solution(new int[]{1, 1}));
        assertEquals(1, ReTestNum4.solution(new int[]{-1000000000, -1000000000, -100000000, 1000000000}));
        assertEquals(6, ReTestNum4.solution(new int[]{1000000000, 1000000000, 1000000000, 1000000000}));
        assertEquals(4, ReTestNum4.solution(new int[]{3, 5, 6, 3, 3, 5}));
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1000;
        }
        assertEquals(ReTestNum4.solution(array), 1000000000);
    }

    @Test
    public void test() {
        assertEquals(7, PleaseLast.solution("011100"));
        assertEquals(11, PleaseLast.solution("10000000000"));
        assertEquals(0, PleaseLast.solution("0"));
    }
}
