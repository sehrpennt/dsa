package com.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a string A denoting a stream of lowercase alphabets. You have to make new string B.

 * B is formed such that we have to find first non-repeating character each time a character
 * is inserted to the stream and append it at the end to B. If no non-repeating character is
 * found then append '#' at the end of B.
 * for input - "abadbc":
 * "a"      -   first non repeating character 'a'
 * "ab"     -   first non repeating character 'a'
 * "aba"    -   first non repeating character 'b'
 * "abad"   -   first non repeating character 'b'
 * "abadb"  -   first non repeating character 'd'
 * "abadbc" -   first non repeating character 'd'
 */


public class NoRepeat {
	public static String nonRepeat(String S) {
		Queue<Character> q= new LinkedList<>();
		int[] count= new int[26];
		StringBuffer out= new StringBuffer("");
		for(int i=0; i<S.length(); i++) {
			count[S.charAt(i)-97]++;
			q.add(S.charAt(i));
			while(q.isEmpty()==false && count[q.peek()-97] > 1) {
				q.poll();
			}
			
			if(q.isEmpty()) {
					out.append("#");
			}	
			else {
				out.append(q.peek());
			}
			
			
			
		}
		return out.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(nonRepeat("abadbc"));
		System.out.println(nonRepeat("aabcdd"));
		
	}

}
