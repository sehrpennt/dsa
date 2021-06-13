package com.dsa.arrays;

class SolutionMinMaxElement{
	public int getMax(int[] arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public int getMin(int[] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}

public class MinMaxElement {
	public static void main(String[] args) {
		SolutionMinMaxElement obj= new SolutionMinMaxElement();
		int[] arr= {12, 1234, 45, 67, 10, 2, 234, 12313, 3434};
		System.out.println(obj.getMax(arr));
		System.out.println(obj.getMin(arr));
	}
}
