package lessons.l7;

import java.util.*;

public class Fish { //100%
	public static int solution(int[] A, int[] B) {
		Stack<Integer> upstream = new Stack<Integer>(); // 0s
		Stack<Integer> downstream = new Stack<Integer>(); // 1s

		int size = A.length;

		if (size > 0) { // empty array check
			if (B[0] == 1) {
				downstream.push(A[0]);
			} else {
				upstream.push(A[0]);
			}
		}

		for (int i = 1; i < size; i++) {
			if (B[i] == 1) {
				downstream.push(A[i]); //downstream fish added to stack as may escape
			} else if (downstream.isEmpty()) {
				upstream.push(A[i]); // upstream would meet downstream but if no downstream, add to stack
			} else if (!downstream.isEmpty()) { // if upstream fish meets downstream fish
				while (!downstream.isEmpty()) { // while there are down fish to meet the upfish
					if(downstream.peek() < A[i]) { //if upstream bigger than downstream
						downstream.pop(); // upstream eats downstream
					} else {
						break; // if downstream bigger break loop as upstream was eaten
					}
					if(downstream.isEmpty()) { // if the loop ended from eating all downstream fish
						upstream.push(A[i]); // upstream survived
					}
				}
			}
		}

		return upstream.size() + downstream.size(); // return total of downstream and upstream fish
	}
}
