package contest.challenging.week02;

/**
 * @author sungyeon.jo
 */
public class CoinQuiz {

	void solve() {
		int[] coin = {1, 5, 10, 50, 100, 500};
		int[] coinCount = {3, 2, 1, 3, 0, 2};
		int amount = 620;

		int sum = 0;
		int change = amount;

		for (int i = coin.length - 1; i >= 0; i--) {
			if (change < coin[i] || coinCount[i] == 0) {
				continue;
			}

			int count = change / coin[i];

			if (coinCount[i] < count) {
				count = coinCount[i];
			}

			change -= (count * coin[i]);

			sum += count;

			System.out.println(coin[i] + "원짜리 " + count + "개");
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		CoinQuiz coinQuiz = new CoinQuiz();
		coinQuiz.solve();
	}

}
