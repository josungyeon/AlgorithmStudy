package coding.interview.week03;

import java.util.Stack;

/**
 * 2개의 스택을 이용하여 큐 구현하기
 * @author sungyeon.jo
 */
public class QueueUsingStack {
	Stack<Integer> s1 = new Stack();
	Stack<Integer> s2 = new Stack();

	void stackQueue() {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
	}

	void enQueue(int data) {
		s1.push(data);
	}

	int deQueue() {
		if (!s2.isEmpty()) {
			return s2.pop();
		} else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}

	public static void main(String[] args) {
		QueueUsingStack queueUsingStack = new QueueUsingStack();
		queueUsingStack.stackQueue();
	}

}
