package lessons.l3;

public class FrogJmp {
	public int solution(int X, int Y, int D) { // 100%
	    double a = (Y-X);
	    a = a/D;

	    if ((int) a == a) {
	    	return (int) a;
	    } else {
	    	return (int) a+1;
	    }
	}
}
