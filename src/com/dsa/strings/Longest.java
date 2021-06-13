package com.dsa.strings;

/*
 * Given the array of strings A,
you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1
and S2.

For Example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".


 */

class SolutionLongest{
	public static String commonPrefix(String[] arr) {
		String s="";
		String temp=arr[0].substring(0,1);
		int i=0, j=0;
		
		//System.out.println(temp);
		
		while(i < arr.length) {
			
			if(j<arr[i].length() && arr[i].substring(0,j+1).equals(temp)) {
				temp=arr[i].substring(0,j+1);
				i++;
			}
			else {
				s+=arr[i].substring(0,j);
				break;
			}
			
			if(i == arr.length) {
				i=0;
				j++;
				if(j < arr[i].length()) {
				temp=arr[i].substring(0,j+1);
				}
			}
		}
		
		return s;
	}
}

public class Longest {

	public static void main(String[] args) {
		String[] arr= {"abcdefgh", "aefghijk", "abcefgh"};
		System.out.println(SolutionLongest.commonPrefix(arr));

	}

}
