package exercises;

public class ParkingBill {
	public static int solution(String E, String L) {
		int cost = 0;
		
		String[] hm1 = E.split(":", 2);
		String[] hm2 = L.split(":", 2);
		
		int hdiff = Integer.parseInt(hm2[0]) - Integer.parseInt(hm1[0]);
		int mdiff = Integer.parseInt(hm2[1]) - Integer.parseInt(hm1[1]);
		
		if(mdiff < 0) {
			int diff = 60 + mdiff;
			
			hdiff -= 1;
			mdiff = diff;
		}		
		
		if(hdiff > 0) {
			if(hdiff > 1) { // greater than 1
				cost = cost + (hdiff-1) * 4 + 3;
				if(mdiff > 0) {
					cost += 4;
				}
			} else { // equal to 1
				cost += 3;
				if(mdiff > 0) {
					cost += 4;
				}
			}
		} else if(mdiff > 0) { // less than 1
			cost += 3;
		}
		
		
		if(cost > 0) {
			cost += 2;
		}
				
		return cost;
	}
}
