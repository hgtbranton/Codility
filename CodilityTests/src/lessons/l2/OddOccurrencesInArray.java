package lessons.l2;

import java.util.*;

public class OddOccurrencesInArray {
	public static int solutionA(int[] A) { //time failed :( 40% score
        List<Integer> p = new ArrayList<Integer>();
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j<A.length; j++) {
				if(i!=j && A[i]==A[j] && !p.contains(A[i])) {
					p.add(A[i]);
				}
			}	
		}

        for(int i = 0; i < A.length; i++){
            if(!p.contains(A[i])){
                return A[i];
            }
        }
				
		return 0;
    }
	
	public static int solutionB(int[] A) { // 100% :) :)
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i : A) { 
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j+1);
		}
		
		for (int i : hm.keySet()) {
			if (hm.get(i)%2 == 1) {
				return i;
			}
		}
		
		return -1; //failed
	}
}
