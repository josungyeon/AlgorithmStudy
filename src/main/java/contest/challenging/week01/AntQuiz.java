package contest.challenging.week01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sungyeon.jo
 */
public class AntQuiz {
	private static final int RANGE_MAX = 106;
	private static final int RANGE_MIN = 1;
	private static final String RIGHT = "우";
	private static final String LEFT = "좌";

	public static void main(String[] args) {
		int L = 10;
		int n = 3;
		List<Integer> X = new ArrayList<Integer>();
		X.add(2);
		X.add(6);
		X.add(7);

//		int L = 9;
//		int n = 4;
//		List<Integer> X = new ArrayList<>();
//		X.add(2);
//		X.add(4);
//		X.add(5);
//		X.add(8);

		printInput(L, n, X);

		int distance;
		int absoluteDistance;

		int mid = L / 2;
		int max = 0;
		int min = 100000000;

		int minValue = 0;
		int maxValue = 0;

		for (int i = 0; i < n; i++) {
			distance = mid - X.get(i);
			absoluteDistance = distance < 0 ? distance * (-1) : distance;

			if (absoluteDistance < min) {
				min = absoluteDistance;
				minValue = X.get(i);
			}

			if (absoluteDistance > max) {
				max = absoluteDistance;
				maxValue = X.get(i);
			}
		}

		int val;
		StringBuilder minBuilder = new StringBuilder();
		StringBuilder maxBuilder = new StringBuilder();

		for (int i = 0; i < n; i++) {
			val = X.get(i);
			if (mid < val) {
				minBuilder.append(RIGHT);
			} else {
				minBuilder.append(LEFT);
			}

			if (mid < maxValue) {
				maxBuilder.append(LEFT);
			} else {
				maxBuilder.append(RIGHT);
			}
		}

		int minResult = mid > minValue ? minValue : L - minValue;
		int maxResult = mid > maxValue ? L - maxValue : maxValue;

		printResult(minBuilder, maxBuilder, minResult, maxResult);
	}

	private static void printResult(StringBuilder minBuilder, StringBuilder maxBuilder, int minResult, int maxResult) {
		System.out.println("출력");
		System.out.println("min = " + minResult + "(" + minBuilder.toString() + ")");
		System.out.println("max = " + maxResult + "(" + maxBuilder.toString() + ")");
	}

	private static void printInput(int l, int n, List<Integer> x) {
		System.out.println("입력");
		System.out.println("L = " + l);
		System.out.println("n = " + n);
		System.out.println("X(i) = " + x);
	}
}
