package lessons.l7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoneWallTest {

	@Test
	void sample() {
		assertEquals(7, StoneWall.solution(new int[] {8,8,5,7,9,8,7,4,8}));
	}
	
	@Test
	void simple() {
		assertEquals(5, StoneWall.solution(new int[] {4,6,2,8,5}));
	}
	
	@Test
	void edgeCase() {
		assertEquals(0, StoneWall.solution(new int[] {}));
		assertEquals(1, StoneWall.solution(new int[] {5,5,5,5,5,5}));
		assertEquals(6, StoneWall.solution(new int[] {9,8,7,6,5,4}));
		assertEquals(6, StoneWall.solution(new int[] {1,2,3,4,5,6}));
	}

}
