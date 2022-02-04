package lessons.l7;

import java.util.Stack;

public class Nesting { //100%
	public static int solution(String S) { 
		char open = '(';
		char close = ')';
		
		Stack<Character> b = new Stack<Character>();
		
		for(int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			
			if(s == open) {
				b.push(s);
			} else if (b.size() == 0) {
				return 0;
			} else if (s == close) {
				b.pop();
			}
		}
	
		if(b.size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
