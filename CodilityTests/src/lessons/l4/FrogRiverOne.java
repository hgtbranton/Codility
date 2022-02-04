package lessons.l4;

import java.util.*;

public class FrogRiverOne {
	public static int solution(int X, int[] A) { //100% correct
		int max = -1;
		
		//HashSet significantly better than ArrayList
		Set<Integer> c = new HashSet<>();
		
		for (int i=1; i <= X; i++) {
			c.add(i);
		}
		
		for (int i = 0; i < A.length; i++) {
				c.remove(A[i]);

				if(c.isEmpty()) {
					max = i;
					break;
				}
		}
		
		return max;
	}
}
