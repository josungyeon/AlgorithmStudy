package kakao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 05/12/2018.
 */
public class OpenChatingTest {
    OpenChating openChating = new OpenChating();

    @Test
    public void testResult() {
        String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        String[] expected = {"Prodo님이 나갔습니다.", "Ryan님이 나갔습니다.", "Prodo님이 들어왔습니다.", "Prodo님이 나갔습니다."};
        String[] actual = openChating.solution(input);

        assertThat(expected, is(actual));
    }
}
