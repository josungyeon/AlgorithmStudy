package kakao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 05/12/2018.
 */
public class CandidateKeyTest {
    CandidateKey sut = new CandidateKey();

    @Test
    public void testResult() {
        String[][] relation = {
                {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}
        };

        int actual = sut.solution(relation);
        int expected = 2;

        assertEquals(expected, actual);
    }
}
