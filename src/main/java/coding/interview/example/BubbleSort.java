package coding.interview.example;

/**
 * @author sungyeon.jo
 */
public class BubbleSort {
	int[] arr = {5,3,8,1,2,7};
	int size = arr.length;

	void solve() {
		boolean isChanged;
		do {
			isChanged = false;
			for (int i = 0; i < size - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					int tmp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = tmp;
					isChanged = true;
				}
			}

		} while (isChanged);

		for (int sortedData : arr) {
			System.out.println(sortedData);
		}
	}

	void solve2() {
		int limit = size - 1;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < limit - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
			limit -= 1;
		}

		for (int sortedData : arr) {
			System.out.println(sortedData);
		}
	}
}
