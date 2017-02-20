package contest.challenging.week02;

/**
 * 프로그래밍 콘테스트 챌린징 p.71 (배낭문제)
 * @author sungyeon.jo
 */
public class KnapsackProblem {
	// 무게의 총 합이 W를 초과하지 않도록 물건을 선택했을 때, 가격 총합의 최대치 구하기
	private int n;
	private int[] weight;
	private int[] value;

	public KnapsackProblem(int n, int[] weight, int[] value) {
		this.n = n;
		this.weight = weight;
		this.value = value;
	}

	//	int W = 5;
//
//	int maxTotalValue;
//
//	int dfs(int i, int totalWeight, int totalValue) {
//		if (i == n) {
//			return maxTotalValue;
//		}
//
//		if (totalWeight < W) {
//			if (maxTotalValue < totalValue) {
//				maxTotalValue = totalValue;
//			}
//		}
//
//		return dfs(i + 1, totalWeight + weight[i], totalValue + value[i]);
//	}
//
//	int dfs2(int i, int totalWeight, int totalValue) {
//		int res;
//
//		if (i == n) {
//			return 0;
//		} else if (totalWeight < W) {
//			res = dfs2(i + 1, totalWeight, totalValue);
//		} else {
//			res = Math.max(dfs2(i + 1, totalWeight + weight[i], totalValue + value[i]), dfs2(i + 1, totalWeight, totalValue));
//		}
//
//		return res;
//	}

	int dfs3(int i, int W) {
		int result;

		if (i == n) {
			result = 0;
		} else if (W < weight[i]) {
			result = dfs3(i + 1, W);
		} else {
			result = Math.max(dfs3(i + 1, W), dfs3(i + 1, W - weight[i]) + value[i]);
		}

		return result;
	}
}
