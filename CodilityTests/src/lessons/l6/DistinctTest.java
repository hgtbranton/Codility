package lessons.l6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistinctTest {

	@Test
	void sample() {
		assertEquals(3, Distinct.solution(new int[] {2,1,1,2,3,1}));
	}
	
	@Test
	void simple() {
		assertEquals(8, Distinct.solution(new int[] {9,4,6,3,2,5,2,7,2,1}));
		assertEquals(0, Distinct.solution(new int[] {}));
		assertEquals(1, Distinct.solution(new int[] {9,9,9,9,9,9,9,9,9}));
	}

}
