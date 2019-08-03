package codility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sungyeonjo on 2019. 8. 3..
 */
public class CyclicRotationTest {
    @Test
    public void test() {
        assertEquals(CyclicRotation.solution(new int[]{-3, -14, -5, 7, 8, 42, 8, 2}), "SUMMER");
        assertEquals(CyclicRotation.solution(new int[]{8, 2, 42, 8, 7, -5, -14, -3}), "SPRING");
        assertEquals(CyclicRotation.solution(new int[]{2,-3,3,1,10,8,2,5,13,-5,3,-18}), "AUTUMN");
        assertEquals("WINTER", CyclicRotation.solution(new int[]{2,-3,3,1,10,8,2,5}));
        assertEquals("WINTER", CyclicRotation.solution(new int[]{-1000,-999,-888,-888,-888,-888,-888,-888}));
        assertEquals("WINTER", CyclicRotation.solution(new int[]{1000,999,888,888,888,888,888,888}));
    }
}
