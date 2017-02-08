package coding.interview.week04;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class TowerOfHanoiTest {
	TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

	@Test
	public void testHanoi() {
		towerOfHanoi.hanoi(4, 'A', 'B', 'C');
	}

}