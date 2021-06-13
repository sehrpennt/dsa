package com.dsa.arrays;

class SolutionReverseArray{
	public int[] reverseArray(int[] arr) {
		int temp=0, i=0, j=arr.length-1;
		while(i<j) {
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		return arr;
	}
}

public class ReverseArray {
	public static void main(String[] args) {
		SolutionReverseArray obj = new SolutionReverseArray();
		int[] arr= {1,4,2,5,3323,60};
		arr=obj.reverseArray(arr);
		for(int i=0; i<arr.length; i++)
		System.out.print("\t"+arr[i]);
	}
}
