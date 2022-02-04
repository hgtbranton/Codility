package lessons.l5;

public class PassingCars {
	public static int solution(int[] A) { //100% with prefix summary
		int[] prefixSum = new int[A.length];
		
		prefixSum[0] = A[0];
		int totalWest = A[0];
		
		for(int i = 1; i < A.length; i++) {
			prefixSum[i] = prefixSum[i-1] + A[i];
			if (A[i] == 1) {
				totalWest += 1;
			}
		}
		
		int totalpairs = 0;
		for(int i = 0; i<A.length; i++) {
			if(A[i] == 0) {
				// pairs += how many cars are going west - how many cars are going west that it didnt pass as they appeared in the array before it
				totalpairs += totalWest - prefixSum[i];
				if (totalpairs > 1000000000) { // stated fail condition
					totalpairs = -1;
					break;
				}
			}
		}
		
		return totalpairs;
	}
	
	public static int solutionb(int[] A) { //100% correct not using prefix sums
		int pass = 0;
		
		int eastcars = 0;
		for(int i = 0; i < A.length; i++) { //for loop counting westcars crossing east cars
			if (pass > 1000000000) {
				return -1;
			} else if (A[i] == 1) {
				pass = pass + eastcars;
			} else if(A[i] == 0) {
				eastcars += 1;
			}
		}
		
		
		// not needed?
		/*for(int i = 0; i < A.length / 2; i++){ //reversing the array to count for east cars
		    int temp = A[i];
		    A[i] = A[A.length - i - 1];
		    A[A.length - i - 1] = temp;
		}
		
		int westcars = 0;
		for(int i = 0; i < A.length; i++) { //for loop counting eastcars crossing east cars
			if (pass/2 > 1000000000) {
				return -1;
			} else if(A[i] == 0) {
				pass = pass + westcars;
			} else if(A[i] == 1) {
				westcars ++;
			}
		}*/
				
		//return pass/2;
		return pass;
	}	
}
