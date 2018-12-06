package kakao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 06/12/2018.
 */
public class FailRateTest {
    FailRate sut = new FailRate();

    @Test
    public void testSolution() {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] expected = {3,4,2,1,5};
        int[] actual = sut.solution(N, stages);

        assertThat(actual, is(expected));
    }

    @Test
    public void testSolution2() {
        int N = 4;
        int[] stages = {4,4,4,4,4};

        int[] expected = {4,1,2,3};
        int[] actual = sut.solution(N, stages);

        assertThat(actual, is(expected));
    }
}
