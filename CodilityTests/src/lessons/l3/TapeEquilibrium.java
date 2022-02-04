package lessons.l3;

public class TapeEquilibrium {
	public static int solution(int[] A) {
		int min;
		
		int a1 = A[0]; // first split
		int a2 = 0; // second split
		for(int i = 1; i < A.length; i++) {
			a2 += A[i]; // calculate second split as whole array minus first element
		}
		
		min = Math.abs(a1 - a2);
		
		// iterate through array increasing the number of elements in a1 by one and decreasing a2 by one
		for(int i = 1; i < A.length-1; i++) {
			a1 += A[i];
			a2 -= A[i];
					
			if (Math.abs(a1-a2) < min) { // track minimum of |a1-a2| as min
				min = Math.abs(a1-a2);
			}
		}
		
		
		return min;
	}
}
