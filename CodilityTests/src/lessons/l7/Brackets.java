package lessons.l7;

import java.util.Stack;

public class Brackets { //100%
	public static int solution(String s) { 
		String open = "{[(";
		String  close = "}])";
		
		Stack<Character> b = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (open.indexOf(c) >= 0) {
				b.push(c);
			} else if (close.indexOf(c) >= 0) {
				if(b.empty()) {
					return 0;
				} else if (b.peek() == open.charAt(close.indexOf(c))) {
					b.pop();
				} else {
					return 0;
				}
			}
		}
		
		if (!b.empty()) {
			return 0;
		} else {
			return 1;
		}
	}
}
