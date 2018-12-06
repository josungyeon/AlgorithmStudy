package kakao;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by sungyeon on 06/12/2018.
 */
public class SortByKNumberTest {
    SortByKNumber sut = new SortByKNumber();

    @Test
    public void testSolution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] expected = {5, 6, 3};
        int[] actual = sut.solution(array, command);

        assertThat(expected, is(actual));
    }

}
