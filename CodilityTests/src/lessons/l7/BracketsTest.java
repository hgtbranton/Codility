package lessons.l7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BracketsTest {

	@Test
	void sample() {
		assertEquals(1, Brackets.solution("{[()()]}"));
	}
	
	@Test
	void simple() {
		assertEquals(1, Brackets.solution("{[{[()()][()]}]}"));
		assertEquals(0, Brackets.solution("[{[)]}]"));
	}
	
	@Test
	void edgeCase() {// tests: empty string, starts with closing bracket, never closes
		assertEquals(1, Brackets.solution(""));
		assertEquals(0, Brackets.solution("){()})"));
		assertEquals(0, Brackets.solution("{{{{{"));
	}

}
