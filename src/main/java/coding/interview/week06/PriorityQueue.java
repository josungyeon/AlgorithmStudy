package coding.interview.week06;

/**
 * 문제11. 이진 힙에서 값 k보다 작은 모든 요소를 찾는 알고리즘을 제시하시오.
 *
 * root값이 limit 보다 작다면 출력, 왼쪽자식 한번 오른쪽 자식 한번 재귀호출
 * limit값보다 큰 값이 나타나면 return
 *
 * @author sungyeon.jo
 */
public class PriorityQueue {
	private int[] array;
	private int limit;

	PriorityQueue(int[] array, int limit) {
		this.array = array;
		this.limit = limit;
	}

	int findLeftIndex(int rootIndex) {
		int index = rootIndex * 2 + 1;

		if (index >= array.length) {
			return -1;
		}

		return index;
	}

	int findRightIndex(int rootIndex) {
		int index = rootIndex * 2 + 2;

		if (index >= array.length) {
			return -1;
		}

		return index;
	}

	void recursive(int rootIndex) {
		if (rootIndex < 0) {
			return;
		}

		if (array[rootIndex] >= limit) {
			return;
		}

		if (array[rootIndex] < limit) {
			System.out.println(array[rootIndex]);

			int leftIndex = findLeftIndex(rootIndex);
			int rightIndex = findRightIndex(rootIndex);
			recursive(leftIndex);
			recursive(rightIndex);
		}
	}
}
