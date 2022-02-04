package runEnv;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.math.BigInteger;


import lessons.l6.*;

public class RunEnv {
    public static void main(String args[]){    	    	
    	int n = (int) ((Math.random() * (100 - 1)) + 1);
    	
    	System.out.println(n);
    	List<Integer> l = new ArrayList<Integer>();
    	 	
    	for(int i = 0; i < n; i++) {
    		l.add((int) ((Math.random() * (10 - 1)) + 1));
    	}
    	System.out.println("size: " + l.size());
    	
    	System.out.println(q2(l));
    	
    }

    public static int[] genRand(int c) {
    	int[] rints = new int[c];
    	
    	for(int i = 0; i < c-1; i++) {
    		int rN = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
    		rints[i] = rN;
    	}
    	 
    	return rints;
    }
    
    public static String q1(String A) {
    	String Ar = "";
    	
    	char[] S = A.toCharArray();
    	
    	for(char a : A.toCharArray()) {
    		Ar += a;
    	}
    	
    	return Ar;
    }
    
    public static int q2(List<Integer> arr) {
		BigInteger total = new BigInteger("1");
		
    	for(int l : arr) {
    		total = total.multiply(BigInteger.valueOf(l));
    	}
    	
    	System.out.println(total);
    	
    	int r = total.mod(new BigInteger("100")).intValue();
    	
    	
    	
    	return r;
    }
    
    public static List<String> q3(int n, int d, String S) {    	    	
    	List<String> re = new ArrayList<String>();
    	re.add(S.substring(d,n) + S.substring(0, d));
    	re.add(" ");
    	re.add(S.substring(n-d,n) + S.substring(0, n-d));	
    	
    	return re;
    }
}

