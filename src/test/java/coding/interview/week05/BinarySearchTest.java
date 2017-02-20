package coding.interview.week05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class BinarySearchTest {
	BinarySearch sut = new BinarySearch();

	@Test
	public void testSolve() {
		assertEquals(5, sut.binarySearch(6, 0, 6));
		assertEquals(2, sut.binarySearch(3, 0, 6));
	}

}