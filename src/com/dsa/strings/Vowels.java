package com.dsa.strings;

/*
 * Given a string A consisting of lowercase characters.

You have to find the number of substrings in A which starts with vowel and end with consonants or vice-versa.

Return the count of substring modulo 10^9 + 7.
 */

class SolutionVowels{
	public static int returnCount(String a) {
		int countv=0, countc=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == 'a'||a.charAt(i) == 'e'||a.charAt(i) == 'i'||a.charAt(i) == 'o'||a.charAt(i) == 'u') {
				countv++;
		}
			else {
				countc++;
			}
		
	}
		return (countc*countv)%1000000007;
	}
}

public class Vowels {
	public static void main(String[] args) {
		System.out.println(SolutionVowels.returnCount("aba"));
	}

}
