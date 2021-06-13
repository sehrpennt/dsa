package com.dsa.arrays;
/*
 * Given an array, a[], and an element x, find a number of occurrences of x in a[].
 */

class SolutionElementFrequency{
	public int frequency(int[] arr, int key) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(key == arr[i]) {
				count++;
			}
		}
		return count;
	}
}

public class ElementFrequency {
	public static void main(String[] args) {
		SolutionElementFrequency obj = new SolutionElementFrequency();
		int[] arr= {1,33,4,5,3,5,678,23,9,3,5};
		System.out.println(obj.frequency(arr, 33));
	}

}
