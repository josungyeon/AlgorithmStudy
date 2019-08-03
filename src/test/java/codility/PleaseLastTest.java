package codility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 8. 2..
 */
public class PleaseLastTest {
    @Test
    public void test() {
        assertEquals(PleaseLast.solution(new int[]{3, 5, 6, 3, 3, 5}), 4);
    }

    @Test
    public void test2() {
        assertEquals(PleaseLast.solution2(new int[]{3,4,3,0,2,2,3,0,0}), 5);
        assertEquals(PleaseLast.solution2(new int[]{4,4,3,3,1,0}), 3);
        assertEquals(PleaseLast.solution2(new int[]{4, 2, 0}), 0);
    }

    @Test
    public void test3() {
        assertEquals(PleaseLast.solution3(83643), "23h14m3s");
        assertEquals(PleaseLast.solution3(7500), "2h5m0s");
    }

    @Test
    public void test4() {
        assertEquals(PleaseLast.solution4("011100"), 7);
    }
}
