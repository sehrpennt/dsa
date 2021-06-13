package com.dsa.arrays;
/*
 * Given an array arr of integer elements, the task is to find the range and coefficient of range
 * of the given array where: 
 * Range: Difference between the maximum value and the minimum value in the distribution. 
 * Coefficient of Range: (Max – Min) / (Max + Min).
 */
class SolutionRangeCoefficient{
	public void range(int[] arr) {
		int max=0, min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("RANGE : \t"+(max-min));
		System.out.println("COEFFICIENT: \t"+(double)(max-min)/(max+min));
	}
}

public class RangeCoefficient {
	public static void main(String[] args) {
		SolutionRangeCoefficient obj = new SolutionRangeCoefficient();
		int[] arr = {5, 10, 15};
		obj.range(arr);
	}
}
