package lessons.l5;

import java.util.*;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) { //100% correctness, performance fail
		int[] r = new int[P.length];
		char[] s = S.toCharArray();
		int size = P.length;
		HashMap<Character, Integer> v = new HashMap<Character, Integer>();
		v.put('A', 1);
		v.put('C', 2);
		v.put('G', 3);
		v.put('T', 4);
		
		for(int i=0; i<size; i++) {
			int min = 5;
			for(int j=P[i]; j<=Q[i]; j++) {
				if(min > v.get(s[j])) {
					min = v.get(s[j]);
				}
				if(min == 1) {
					break;
				}
			}
			r[i] = min;
		}
		
		return r;
	}
	
	public int[] solutionb(String S, int[] P, int[] Q) { //100% correctness, performance fail
		int[]r = new int[P.length];
		
		for(int i=0; i<P.length; i++) {
			//splice the selected region of text
			String s = S.substring(P[i], Q[i]+1);
			System.out.println(s);
			if(s.contains("A")) {
				r[i] = 1;
			} else if (s.contains("C")) {
				r[i] = 2;
			} else if (s.contains("G")) {
				r[i] = 3;
			} else if (s.contains("T")) {
				r[i] = 4;
			}
		}
		
		return r;
	}
}
