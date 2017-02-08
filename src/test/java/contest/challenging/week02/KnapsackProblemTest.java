package contest.challenging.week02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class KnapsackProblemTest {
	private KnapsackProblem knapsackProblem;

	@Test
	public void testSolve() {
		int n = 4;
		int[] weight = {2, 1, 3, 2};
		int[] value = {3, 2, 4, 2};
		int W = 5;
		knapsackProblem = new KnapsackProblem(n, weight, value);

		assertEquals(knapsackProblem.dfs3(0, W), 7);
	}

	@Test
	public void testSolve2() {
		int n = 3;
		int[] weight = {6, 3, 3};
		int[] value = {3, 2, 4};
		int W = 6;
		knapsackProblem = new KnapsackProblem(n, weight, value);

			assertEquals(knapsackProblem.dfs3(0, W), 6);
	}

}