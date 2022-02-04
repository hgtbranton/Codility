package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkyQ1Test {

	@Test
	void sample() {
		assertEquals(2, SkyQ1.solution("a0Ba"));
	}
	
	@Test
	void simple() {
		assertEquals(4, SkyQ1.solution("aAbB"));
		assertEquals(-1, SkyQ1.solution("012451"));
		assertEquals(2, SkyQ1.solution("0aB0"));
		assertEquals(-1, SkyQ1.solution("abasda"));
		assertEquals(4, SkyQ1.solution("aBa0aCkk"));
	}
	
	@Test
	void edgeCase() {
		assertEquals(-1, SkyQ1.solution(""));
		assertEquals(1, SkyQ1.solution("A0B00123A0"));
		assertEquals(1, SkyQ1.solution("A0000000aaaaaaaaaa"));
		assertEquals(1, SkyQ1.solution("aaaaaaaaa000000000A"));
		assertEquals(1, SkyQ1.solution("A"));
	}

}
