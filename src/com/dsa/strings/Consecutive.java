package com.dsa.strings;

//Given a string A and integer B, remove all consecutive same characters that have length exactly B.
class SolutionConsecutive{
	public static String solve(String A, int B) {
		String out_string="";
		int j=0, i=0;
		
		while(i<A.length()) {
			while(j<A.length() && A.charAt(i) == A.charAt(j)) {
				j++;
			}
			
			if(j-i == B) {
				i=j;
			}
			else {
				while(i < j) {
				out_string+=A.charAt(i);
				i++;
				}
			}
			
		}
		
		return out_string;
	}
}

public class Consecutive {

	public static void main(String[] args) {
		System.out.println(SolutionConsecutive.solve("abccdee", 2));

	}

}
