package contest.challenging.week02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class LakeCountingTest {
	LakeCounting lakeCounting;

	@Test
	public void testLakeCounting() {
		String[][] lakeMap =
				{{"W", ".", ".", ".", ".", ".", ".", ".", ".", "W", "W", "."}
				,{".", "W", "W", "W", ".", ".", ".", ".", ".", "W", "W", "W"}
				,{".", ".", ".", ".", "W", "W", ".", ".", ".", "W", "W", "."}
				,{".", ".", ".", ".", ".", ".", ".", ".", ".", "W", "W", "."}
				,{".", ".", ".", ".", ".", ".", ".", ".", ".", "W", ".", "."}
				,{".", ".", "W", ".", ".", ".", ".", ".", ".", "W", ".", "."}
				,{".", "W", ".", "W", ".", ".", ".", ".", ".", "W", "W", "."}
				,{"W", ".", "W", ".", "W", ".", ".", ".", ".", ".", "W", "."}
				,{".", "W", ".", "W", ".", ".", ".", ".", ".", ".", "W", "."}
				,{".", ".", "W", ".", ".", ".", ".", ".", ".", ".", "W", "."}
				};
		lakeCounting = new LakeCounting(lakeMap, 10, 12);

		assertEquals(lakeCounting.solve(), 3);
	}

}