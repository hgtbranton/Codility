package lessons.l7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NestingTest {

	@Test
	void sample() {
		assertEquals(1, Nesting.solution("(()(())())"));
		assertEquals(0, Nesting.solution("(()"));
	}
	
	@Test
	void edgeCase() {
		assertEquals(0, Nesting.solution("((((("));
		assertEquals(0, Nesting.solution(")()"));
		assertEquals(0, Nesting.solution("(()()(()())))"));
		assertEquals(1, Nesting.solution(""));
	}

}
