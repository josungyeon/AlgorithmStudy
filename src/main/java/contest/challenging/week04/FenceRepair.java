package contest.challenging.week04;

import java.util.Arrays;

/**
 * p.66
 * @author sungyeon.jo
 */
public class FenceRepair {
	int getMinCost(int N, int[] L) {
		// 정렬을 해서, 앞에것들부터 짝을짓고 더해나가는 방식
		Arrays.sort(L);

		int sum = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = 0;j < N - i; j++) {
				sum += L[j];
			}
		}

		return sum;
	}

}
