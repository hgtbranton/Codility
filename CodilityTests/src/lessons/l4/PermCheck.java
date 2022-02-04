package lessons.l4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
	// check for permutation 
	public static int solution(int[] A) { // 100% correct
		//Sum alone not enough to detect permutation, set needed to prevent [1,4,1] returning 1.
		Set<Integer> c = new HashSet<>();
		int csum = ((A.length * A.length) + A.length)/2;
		
		int t = 0;
		for(int i=0; i<A.length; i++) {
			c.add(A[i]);
			t += A[i];
		}
		
		if(csum == t && c.size() == A.length) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
}
