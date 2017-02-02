package contest.challenging.week02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class KnapsackProblemTest {
	private KnapsackProblem knapsackProblem = new KnapsackProblem();

	@Test
	public void testSolve() {
		assertEquals(knapsackProblem.dfs3(0, 5), 7);
	}

}