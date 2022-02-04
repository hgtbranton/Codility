package lessons.l1;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class BinaryGap {
    public static int solution(int N) {
        String binN = Integer.toBinaryString(N);

        int longest = 0;
        int gap = 0;
        for (int i=0; i<binN.length(); i++){
            if (binN.charAt(i) == '0'){
                gap ++;
            } else {
                if (gap > longest){
                longest = gap;
                }
                gap = 0;
            }
            
        }
        if(longest == binN.length()-1){
            longest = 0;
        }

        return longest;
    }
}