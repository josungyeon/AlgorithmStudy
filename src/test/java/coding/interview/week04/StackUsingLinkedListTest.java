package coding.interview.week04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class StackUsingLinkedListTest {
	StackUsingLinkedList stackUsingLinkedList;

	@Before
	public void setUp() {
		stackUsingLinkedList = new StackUsingLinkedList();
	}

	@Test
	public void testPushStackUsingLinkedList() {
		stackUsingLinkedList.push("1");
		stackUsingLinkedList.push("2");
		stackUsingLinkedList.push("3");

		assertEquals(stackUsingLinkedList.get(0), "3");
		assertEquals(stackUsingLinkedList.get(1), "2");
		assertEquals(stackUsingLinkedList.get(2), "1");
	}

	@Test
	public void testPopStackUsingLinkedList() {
		stackUsingLinkedList.push(1);
		stackUsingLinkedList.push(2);
		stackUsingLinkedList.push(3);

		stackUsingLinkedList.pop();

		assertEquals(stackUsingLinkedList.get(0), 2);
		assertEquals(stackUsingLinkedList.get(1), 1);
		assertEquals(stackUsingLinkedList.peek(), 2);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		stackUsingLinkedList.push(5);
		stackUsingLinkedList.push(6);

		stackUsingLinkedList.getNode(3);
	}

}