package contest.challenging.week04;

/**
 * p.64
 * @author sungyeon.jo
 */
public class SarumansArmy {

	void solve(int N, int R, int[] X) {
		for (int i = 1; i < N - 1; i++) {
			System.out.println(X[i]);
			isWithinRange(X[i-1], X[i], X[i+1], R);
		}
	}

	boolean isWithinRange(int prev, int target, int next, int range) {
		int minRange = target - range;
		int maxRange = target + range;

		return (prev >= minRange) && (next <= maxRange);
	}

}
