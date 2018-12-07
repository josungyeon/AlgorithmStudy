package kakao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 07/12/2018.
 */
public class MaxNumberTest {
    MaxNumber sut = new MaxNumber();

    @Test
    public void testSolution() {
        int[] number = {6, 10, 2};
        String result = sut.solution(number);

        assertThat("6210", is(result));
    }

    @Test
    public void testSolution2() {
        int[] number =  {3, 30, 34, 5, 9};
        String expected = sut.solution(number);

        assertThat("9534330", is(expected));
    }
}
