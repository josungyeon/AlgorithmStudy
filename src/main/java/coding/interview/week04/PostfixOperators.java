package coding.interview.week04;

import java.util.Stack;

import org.apache.commons.lang.StringUtils;

/**
 * 스택을 이용한 후위 연산
 * ex) 123*+5- (답 : 2)
 * @author sungyeon.jo
 */
public class PostfixOperators {
	Stack<String> opStack = new Stack();

	int solve(String[] inputOperators) {
		for (String input : inputOperators) {
			if (isOperator(input)) {
				int op1 = Integer.parseInt(opStack.pop());
				int op2 = Integer.parseInt(opStack.pop());
				int result = operator(op2, input, op1);
				opStack.push(Integer.toString(result));

			} else {
				opStack.push(input);
			}
			System.out.println(input + "-> " + opStack);
		}

		return Integer.parseInt(opStack.peek());
	}

	boolean isOperator(String operand) {
		return StringUtils.equals(operand, "*") || StringUtils.equals(operand, "+")
				|| StringUtils.equals(operand, "-") || StringUtils.equals(operand, "/");
	}

	int operator(int a, String operator, int b) {
		int result = 0;

		if (StringUtils.equals(operator, "*")) {
			result = a * b;
		} else if (StringUtils.equals(operator, "+")) {
			result = a + b;
		} else if (StringUtils.equals(operator, "-")) {
			result = a - b;
		} else if (StringUtils.equals(operator, "/")) {
			result = a / b;
		}
		return result;
	}

}
