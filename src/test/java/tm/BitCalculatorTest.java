package tm;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sungyeon on 06/12/2018.
 */
public class BitCalculatorTest {
    @Test
    public void test() {
        assertThat(3, is(BitCalculator.countBits(7)));

    }
}
