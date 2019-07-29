package kakao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 07/12/2018.
 */
public class RunnerTest {
    Runner sut = new Runner();
    @Test
    public void testSolution() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String result = "leo";

        assertThat(result, is(sut.solution(participant, completion)));
    }

    @Test
    public void testSolution2() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = "mislav";

        assertThat(result, is(sut.solution(participant, completion)));
    }
}
