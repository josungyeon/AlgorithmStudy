package coding.interview.week02;

/**
 * @author sungyeon.jo
 */
public class Square {

	int solve(int below, int square) {
		if (square == 1) {
			return below;
		}
		return below * solve(below, square - 1);
	}
}
