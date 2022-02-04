package lessons.l6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void sample() {
		assertEquals(1, Triangle.solution(new int[] {10,2,5,1,8,20}));
	}
	
	@Test
	void simple() {
		assertEquals(0, Triangle.solution(new int[] {10,50,5,1}));
	}
	
	@Test
	void edgeCases() {
		assertEquals(0, Triangle.solution(new int[] {}));
		assertEquals(1, Triangle.solution(new int[] {1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3}));
	}

}
