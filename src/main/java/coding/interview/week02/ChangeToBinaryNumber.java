package coding.interview.week02;

import org.apache.commons.lang.StringUtils;

/**
 * 10진수 -> 2진수로 변환
 * @author sungyeon.jo
 */
public class ChangeToBinaryNumber {

	public static void main(String args[]) {
		ChangeToBinaryNumber changeToBinaryNumber = new ChangeToBinaryNumber();
		System.out.println(changeToBinaryNumber.recursive(6));
	}

	public static int recursive(int n) {
		if (n == 1) {
			return 1;
		} else {
			int k = n % 2;
			System.out.println(k);
			return recursive(n/2);
		}
	}
}
