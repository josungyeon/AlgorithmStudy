package coding.interview.week03;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2개의 큐를 사용하여 스택 구현
 * @author sungyeon.jo
 */
public class StackUsingQueue {
	Queue q1 = new PriorityQueue();
	Queue q2 = new PriorityQueue();

	void queueStack() {
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
	}

	void push(int data) {
		if (q1.isEmpty()) {
			q2.add(data);
		} else {

		}
		q1.add(data);
	}

	int pop() {
		return 0;
	}

	public static void main(String[] args) {
		StackUsingQueue queueQuiz = new StackUsingQueue();
		queueQuiz.queueStack();
	}
}
