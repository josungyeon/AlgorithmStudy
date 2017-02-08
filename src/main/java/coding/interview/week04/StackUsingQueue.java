package coding.interview.week04;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 2개의 큐를 사용하여 스택 구현
 * @author sungyeon.jo
 */
public class StackUsingQueue {
	Queue<String> q1 = new PriorityQueue();
	Queue<String> q2 = new PriorityQueue();

	void push(String data) {
		q1.add(data);
	}

	String pop() {
		if (!q2.isEmpty()) {
			return q2.remove();
		} else {
			while(!q1.isEmpty()) {
				q2.add(q1.remove());
			}
			return q2.remove();
		}
	}

	String peek() {
		return q2.peek();
	}
}
