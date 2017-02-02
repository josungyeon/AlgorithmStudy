package coding.interview.week02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class SquareTest {
	Square square = new Square();

	@Test
	public void testSquare() {
		assertEquals(square.solve(2, 10), 1024);
	}

}