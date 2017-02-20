package contest.challenging.week02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sungyeon.jo
 */
public class ShortestOfMazeTest {
	ShortestOfMaze shortestOfMaze;
	@Before
	public void setUp() throws Exception {
		shortestOfMaze = new ShortestOfMaze();
	}

	@Test
	public void testShortestOfMaze() {
		int N = 10;
		int M = 10;

		String[][] mazeMap =
				{{"#", "S", "#", "#", "#", "#", "#", "#", ".", "#"}
				,{".", ".", ".", ".", ".", ".", "#", ".", ".", "#"}
				,{".", "#", ".", "#", "#", ".", "#", "#", ".", "#"}
				,{".", "#", ".", ".", ".", ".", ".", ".", ".", "."}
				,{"#", "#", ".", "#", "#", ".", "#", "#", "#", "#"}
				,{".", ".", ".", ".", "#", ".", ".", ".", ".", "#"}
				,{".", "#", "#", "#", "#", "#", "#", "#", ".", "#"}
				,{".", ".", ".", ".", "#", ".", ".", ".", ".", "."}
				,{".", "#", "#", "#", "#", ".", "#", "#", "#", "."}
				,{".", ".", ".", ".", "#", ".", ".", ".", "G", "#"}
				};

		// 정상적인 입력이라 가정
		shortestOfMaze.getShortest(N, M, mazeMap);
	}

}