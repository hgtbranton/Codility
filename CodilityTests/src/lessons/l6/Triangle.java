package lessons.l6;

import java.util.Arrays;

public class Triangle { //93% : int overflow incase of 3 max ints
	public static int solution(int[] A) {
		Arrays.sort(A);
		
		for(int i = 2; i < A.length; i++) {
			if(A[i] < A[i-1] + A[i-2]) {
				return 1;
			}
		}
		
		return 0;		
	}
}
