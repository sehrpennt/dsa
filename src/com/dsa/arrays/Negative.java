package com.dsa.arrays;

/*
 * An array contains both positive and negative numbers in random order. 
 * Rearrange the array elements so that all negative numbers appear before all positive numbers.
 */

class SolutionNegative{
	public int[] move(int[] arr) {
		int temp=0, low=0, high=arr.length-1;
		
		while(low < high) {
			if(arr[low] > 0) {
				if(arr[high] < 0) {
					temp=arr[high];
					arr[high]=arr[low];
					arr[low]=temp;
					low++;
					high--;
				}
				else {
					high--;
					continue;
				}
			}
			else if(arr[low] < 0) {
				if(arr[high] < 0) {
					low++;
					continue;
				}
				else {
					low++;
					high--;
				}
			}
		
			
		}
		
		return arr;
	}
}

public class Negative {
	public static void main(String[] args) {
		SolutionNegative obj = new SolutionNegative();
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6, 8, -12, 4, 3, -1	};
		arr=obj.move(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
	}
}
