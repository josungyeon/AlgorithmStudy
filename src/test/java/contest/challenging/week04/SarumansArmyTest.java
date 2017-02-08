package contest.challenging.week04;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class SarumansArmyTest {
	SarumansArmy sarumansArmy = new SarumansArmy();

	// n개 모든 점에 대해 거리가 R 이내의 장소에 표시를 해둔 점이 없으면 안됨..
	// (자신에게 표시가 있으면 거리가 0인 곳에 있다고 생각할 수 있음)
	// 그럼 50은... 50은 R 이내의 장소에 표시를 해 둔 점이 없는데..

	@Test
	public void testSolve() throws Exception {
		int N = 6;
		int R = 10;
		int[] X = {1, 7, 15, 20, 30, 50};

		sarumansArmy.solve(N, R, X);
	}

	@Test
	public void testIsWithinRange() throws Exception {
		System.out.println(sarumansArmy.isWithinRange(1, 7, 15, 10));
	}

}