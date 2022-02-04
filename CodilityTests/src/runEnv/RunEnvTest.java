package runEnv;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RunEnvTest {

	@Test
	void sample() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(25);
		l.add(50);
		
		assertEquals(50, RunEnv.q2(l));
	}
	
	
	@Test
	void large() {
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++) {
			l.add(100);
		}
				
		assertEquals(00, RunEnv.q2(l));		
	}
	
	@Test
	void edgeCase() {
		List<Integer> l = new ArrayList<Integer>();
		//for(int i =)
	}

}
