package contest.challenging.week02;

/**
 * @author sungyeon.jo
 */
public class CoinQuiz {
	int[] coin;
	int[] coinCount;
	int amount;

	public CoinQuiz(int[] coin, int[] coinCount, int amount) {
		this.coin = coin;
		this.coinCount = coinCount;
		this.amount = amount;
	}

	int solve() {
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
		return sum;
	}

}
