package coding.interview.week04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class StackUsingQueueTest {
	StackUsingQueue stackUsingQueue;
	@Before
	public void setUp() {
		stackUsingQueue = new StackUsingQueue();
	}

	@Test
	public void queueStack() throws Exception {
		stackUsingQueue.push("A");
		stackUsingQueue.push("B");
		stackUsingQueue.push("C");
		stackUsingQueue.push("D");
		stackUsingQueue.push("E");

		assertEquals(stackUsingQueue.pop(), "A");
		assertEquals(stackUsingQueue.pop(), "B");
		assertEquals(stackUsingQueue.pop(), "C");

		assertEquals(stackUsingQueue.peek(), "D");
	}

	@Test
	public void queueStack2() throws Exception {
		stackUsingQueue.push("1");
		stackUsingQueue.push("2");
		stackUsingQueue.push("3");
		stackUsingQueue.pop();
		assertEquals(stackUsingQueue.peek(), "2");
		stackUsingQueue.push("4");
		stackUsingQueue.push("5");

		assertEquals(stackUsingQueue.pop(), "2");
		assertEquals(stackUsingQueue.pop(), "3");
		assertEquals(stackUsingQueue.pop(), "4");

		assertEquals(stackUsingQueue.peek(), "5");
	}

}