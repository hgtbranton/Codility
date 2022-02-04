package lessons.l5;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class GenomicRangeQueryTest {

	private static GenomicRangeQuery grq;
	
	@BeforeClass
	public static void setUp() {
		grq = new GenomicRangeQuery();
	}
	
	@Test
	public void sample() {
		assertArrayEquals(new int[] {2,4,1}, grq.solutionb("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6}));
	}
	
	@Test
	public void tests() {
		assertArrayEquals(new int[] {1,3,1,1}, grq.solutionb("CGTTTGAAGTA", new int[] {3,2,0,7}, new int[] {6,5,8,7}));
	}

}
