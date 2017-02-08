package contest.challenging.week04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class FenceRepairTest {
	FenceRepair fenceRepair;
	@Before
	public void setUp() throws Exception {
		fenceRepair = new FenceRepair();
	}

	@Test
	public void solve() throws Exception {
		int N = 4;
//		int[] L = {2, 3, 4, 6};
		int[] L = {2, 6, 4, 3};

		assertEquals(fenceRepair.getMinCost(N, L), 29);
	}

	@Test
	public void solve2() throws Exception {
		int N = 3;
		int[] L = {5, 8, 8};

		assertEquals(fenceRepair.getMinCost(N, L), 34);
	}

}