package lessons.l6;

import java.util.Arrays;

public class MaxProductOfThree {
	public static int solution(int[] A) {
		Arrays.sort(A); //more efficient than quickSort?
		
		int big = A.length-1;
		
		//more efficient than a loop
		int lprod = A[big] * A[big-1] * A[big-2];
		
		if(A[0] * A[1] * A[A.length-1] > lprod) {
			return A[0] * A[1] * A[A.length-1];
		} else if(A.length != 0) {
			return lprod;
		} else { return 0; }
	}
}
