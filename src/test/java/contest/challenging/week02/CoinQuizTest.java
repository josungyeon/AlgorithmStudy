package contest.challenging.week02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class CoinQuizTest {
	@Test
	public void testSolve() throws Exception {
		int[] coin = {1, 5, 10, 50, 100, 500};
		int[] coinCount = {3, 2, 1, 3, 0, 2};
		int amount = 620;

		CoinQuiz coinQuiz = new CoinQuiz(coin, coinCount, amount);
		assertEquals(coinQuiz.solve(), 6);
	}

}