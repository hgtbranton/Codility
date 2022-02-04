package lessons.l5;

public class CountDiv {
	public int solution(int A, int B, int K) { // 100% correct
		// if A is a multiple of K then number of times K divides by B minus number of times A divides by K
		// plus one to account for minusing A which is a multiple of K
		// if A is not a multiple then just dont add 1 back on
		return A % K == 0 ? B / K - A / K + 1: B / K - A / K;
	}
	
	/*
	public static int solutionb(int A, int B, int K) {// prefix sums using an array fashion cause memory overflow with large numbers
		float total = B-A+1;
		int[] pS = new int[(int) Math.ceil(total/K)];
		
		System.out.println(total + "/" + K + " : " + pS.length);
		
		for(int i = A; i <= B; i++) {
			System.out.println("in " + A + " - " + B);
			if(i%K == 0) {
				pS[0] = i;
				break;
			} else if(pS.length == 1) {
				return 0;
			}
		}
		
		for(int i = 1; pS[i-1] <= B-K; i++) {
			pS[i] = pS[i-1] + K;
		}
		
		if(pS.length == 1 && pS[0] == 0) {
			return 0;
		} else {
			return pS.length;
		}
	}*/
}
