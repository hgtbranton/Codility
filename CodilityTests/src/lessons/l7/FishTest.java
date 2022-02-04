package lessons.l7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FishTest {

	@Test
	void sample() {
		assertEquals(2, Fish.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }));
	}

	@Test
	void simple() {
		assertEquals(2, Fish.solution(new int[] { 4, 3, 6, 7, 5 }, new int[] { 1, 0, 0, 1, 0 }));
	}

	@Test
	void edgeCase() {
		assertEquals(0, Fish.solution(new int[] {}, new int[] {}));
		assertEquals(1, Fish.solution(new int[] { 4, 3, 6, 7, 10 }, new int[] { 1, 1, 1, 1, 0 }));
		assertEquals(1, Fish.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 1, 0, 0, 0, 0 }));
		assertEquals(5, Fish.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 0, 0, 0, 0 }));
		assertEquals(5, Fish.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 1, 1, 1, 1, 1 }));
	}

}
