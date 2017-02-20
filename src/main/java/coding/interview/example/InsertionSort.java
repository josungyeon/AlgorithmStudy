package coding.interview.example;

/**
 * 삽입정렬 구현
 * @author sungyeon.jo
 */
public class InsertionSort {
	int[] arr = {5,3,8,1,2,7};

	void solve() {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int data : arr) {
			System.out.println(data);
		}
	}
}
