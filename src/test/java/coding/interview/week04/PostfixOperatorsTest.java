package coding.interview.week04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class PostfixOperatorsTest {
	PostfixOperators postfixOperators;

	@Before
	public void setUp() throws Exception {
		postfixOperators = new PostfixOperators();
	}

	@Test
	public void testPostfixOperators() {
		String[] input = {"1", "2", "3", "*", "+", "5", "-"};
		assertEquals(postfixOperators.solve(input), 2);
	}

}