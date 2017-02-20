package coding.interview.week05;

/**
 * 이진탐색 알고리즘 재귀 구현
 * @author sungyeon.jo
 */
public class BinarySearch {
	int[] arr = {1, 2, 3, 4, 5, 6, 7};

	//n : 찾고자 하는 숫자
	int binarySearch(int n, int left, int right) {
		int middle =  (left + right) / 2;

		if (arr[middle] == n) {
			return middle;
		} else if (arr[middle] < n) {
			return binarySearch(n, middle + 1, right);
		} else {
			return binarySearch(n, left + 1, middle);
		}
	}
}
