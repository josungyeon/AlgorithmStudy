package coding.interview.week04;

/**
 * 하노이의 탑
 * @author sungyeon.jo
 */
public class TowerOfHanoi {

	void hanoi(int n, char from, char middle, char to) {
		if (n == 1) {
			System.out.println(from + "-" + n + "->" + to);
		} else {
			hanoi(n-1, from, to, middle);
			System.out.println(from + "-" + n + "->" + to);
			hanoi(n-1, middle, from, to);
		}
	}
}
