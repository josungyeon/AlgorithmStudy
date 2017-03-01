package coding.interview.week06;

import org.junit.Test;

/**
 * @author sungyeon.jo
 */
public class PriorityQueueTest {

	/**
	 * ex)
	 * 					1
	 * 			2				5
	 *		3		4		6		7
	 */
	@Test
	public void testSolve() throws Exception {
		int[] arr = {1, 2, 5, 3, 4, 6, 7};
		PriorityQueue priorityQueue = new PriorityQueue(arr, 4);
		priorityQueue.recursive(0);
	}

}