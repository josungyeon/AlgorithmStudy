package kakao;

import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by sungyeon on 14/12/2018.
 */
public class TopTest {
    private static final Logger logger = Logger.getLogger("TopTest");

    @Test
    public void testTop() {
        List<Character> letters = Arrays.asList('A', 'B', '1', '2', 'C', 'D', '3', 'E', '4', '5');

        logger.info("before letters : " + letters);

        letters.removeIf(i -> Character.isDigit(i));

        logger.info("after letters : " + letters);
    }
}
