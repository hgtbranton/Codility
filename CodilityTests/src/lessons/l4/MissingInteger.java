package lessons.l4;

import java.util.*;
import java.util.stream.Collectors;

public class MissingInteger { //88% correctness, some performance loss probably in set conversion
	public static int solution(int[] A) {
		Set<Integer> nums = Arrays.stream(A).boxed().collect(Collectors.toSet());
		int smallest = 1;
		
		for(int i = 0; i <= nums.size(); i++) {
			if(nums.contains(smallest)) {
				smallest++;
			} else {
				break;
			}
		}
		
		return smallest;
	}
}
