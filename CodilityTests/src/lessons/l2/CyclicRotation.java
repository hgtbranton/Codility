package lessons.l2;

public class CyclicRotation { // 87%
	public static int[] solution(int[] A, int K) {
        
		int size = A.length;
        int[] newA = new int[size];
        
        if(size>0) {
        	K%=size;
        }
        
        for (int i = 0; i<size-K; i++){
            newA[K+i] = A[i];
        }
        
        for (int i = 0; i<K; i++){
            newA[i] = A[size-K+i];
        }


        return newA;
    }
}
