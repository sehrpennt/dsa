package com.dsa.arrays;

class SolutionSelectionSort{
	public int[] sortArray(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length-1; i++)
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;							
				}
			}
		return arr;
	}
	
}

public class SelectionSort {
	public static void main(String[] args) {
		SolutionSelectionSort obj = new SolutionSelectionSort();
		int[] arr= {5,11,3,4,6,8,3,5,9,2340};
		arr=obj.sortArray(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print("\t"+arr[i]);
	}

}
