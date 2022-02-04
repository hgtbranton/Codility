package lessons.l4;

public class MaxCounters {
		public static int[] solution(int N, int[] A) { //100% correct
		int[] counters = new int[N];
		int max = 0; //highest value
		int cmax = 0; //current max as of last max call
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] > N) {
				cmax = max;
			} else {
				if(counters[A[i]-1] < cmax) { // if value hasnt been updated since last max call
					counters[A[i]-1] = cmax + 1;
				} else {
					counters[A[i]-1] ++;
				}
				if(counters[A[i]-1] > max) { // update highest value incase of max call
					max = counters[A[i]-1];
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(counters[i] < cmax) {
				counters[i] = cmax;
			};
		}
		
		return counters;		
	}
}
	// First attempt 77% correctness
	// Efficiency gained from making cmax counter which allowed for loop to be moved to the end
	
	/*public static int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0; //current highest value
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] == N+1) {
				for(int j = 0; j < N; j++) {
					counters[j] = max;
				}
			} else {
				counters[A[i]-1] ++;
				if(counters[A[i]-1] > max) {
					max = counters[A[i]-1];
				}
			}
		}
		
		return counters;
	}*/
