package lessons.l6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxProductOfThreeTest {

	@Test
	void sample() {
		assertEquals(60, MaxProductOfThree.solution(new int[] {-3,1,2,-2,5,6}));
	}
	
	@Test
	void simple() {
		assertEquals(560, MaxProductOfThree.solution(new int[] {4,7,2,5,6,-5,-6,2,-5,10,8}));
		assertEquals(60, MaxProductOfThree.solution(new int[] {-3,1,2,-2,5,6}));
		assertEquals(-300, MaxProductOfThree.solution(new int[] {-10,-10,-3,-24,-11,-16}));
		assertEquals(125, MaxProductOfThree.solution(new int[] {-5,5,-5,4}));
	}

	@Test
	void edge() {
		assertEquals(0, MaxProductOfThree.solution(new int[] {0,0,0,0,0,0}));
		assertEquals(1, MaxProductOfThree.solution(new int[] {1,1,1,1,1,1,1}));
		assertEquals(1000000000, MaxProductOfThree.solution(new int[] {1000,1000,1000,2,4,6,2,3}));
		
	}
	
}
