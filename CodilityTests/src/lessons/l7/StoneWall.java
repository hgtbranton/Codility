package lessons.l7;

import java.util.Stack;

public class StoneWall {
	public static int solution(int[] H) {
		int c = 0; // counting blocks
		int size = H.length;
				
		Stack<Integer> bloks = new Stack<Integer>();
		
		if(size > 0) {
			System.out.println(H[0] + "\n");
			bloks.push(H[0]);
			c+=1;
		} else {
			return 0;
		}
		
		for(int i = 1; i<size; i++) { //iterating through heights
			if(H[i] > bloks.peek()) {
				System.out.println(H[i] + " 1st\n");
				bloks.push(H[i]);
				c += 1;
			} else if(H[i] < bloks.peek()) {
				System.out.println("stack: " + bloks.toString());
				while(!bloks.isEmpty() && H[i] < bloks.peek()) {
					bloks.pop();
				}
				System.out.println("stack: " + bloks.toString());
				System.out.println(H[i] + " 2nd\n"); //going back to the same level doesnt need to increase count
				bloks.push(H[i]);
				c += 1;
			}
		}
		
		
		
		return c; // number of blocks
	}
}
