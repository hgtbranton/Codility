package exercises;

public class SkyQ1 {
	public static int solution(String S) {
		int longest = 0; //longest valid pw string
		boolean valid = false; //indicates if string is valid
		
		char[] str = S.toCharArray();
		
		int temp = 0;
		for(int i = 0; i < str.length; i++) {
			if(!Character.isDigit(str[i])) { //if not a number
				temp += 1;
				if(Character.isUpperCase(str[i])) { //upper case needed for valid pw
					valid = true;
				}
			} else { //if number
				if(valid == true && temp > longest) { //update longest valid string length
					longest = temp;
				}
				temp = 0; //reset
				valid = false;
			}			
		}
		
		if(valid == true && temp > longest) { //last check incase longest valid is at the end of the string
			longest = temp;
		}
		
		if(longest == 0) { //no valid string return -1
			return -1;
		} else {
			return longest;
		}
	}
}
