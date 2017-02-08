package contest.challenging.week02;

import org.apache.commons.lang.StringUtils;

/**
 * @author sungyeon.jo
 */
public class LakeCounting {
	private String[][] gardenMap;
	private int N;
	private int M;

	public LakeCounting(String[][] gardenMap, int n, int m) {
		this.gardenMap = gardenMap;
		N = n;
		M = m;
	}

	void recursive(int i, int j) {
		if (i < 0 || i >= N || j < 0 || j >= M) {
			return;
		}

		if (StringUtils.equals(gardenMap[i][j], "W")) {
			gardenMap[i][j] = ".";

			recursive(i - 1, j - 1);
			recursive(i, j - 1);
			recursive(i + 1, j - 1);

			recursive(i - 1, j);
			recursive(i + 1, j);

			recursive(i - 1, j + 1);
			recursive(i, j + 1);
			recursive(i + 1, j + 1);
		}
	}

	int solve() {
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (StringUtils.equals(gardenMap[i][j], "W")) {
					recursive(i, j);
					result++;
				}
			}
		}

		System.out.println("result = " + result);
		return result;
	}
}
