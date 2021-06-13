package com.dsa.arrays;
//Sort the array of 0s, 1s, and 2s
class Solution012{
	public int[] sortArray(int[] arr) {
		int count0=0, count1=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count0++;
			}
			else if(arr[i] == 1) {
				count1++;
			}
		}
	
		for(int i=0; i<arr.length; i++) {
			if(i < count0) {
				arr[i]=0;
			}
			else if(i < count0+count1) {
				arr[i]=1;
			}
			else {
				arr[i]=2;
			}
		}
		
	return arr;
	}
}

public class Sort012 {

	public static void main(String[] args) {
		Solution012 obj = new Solution012();
		int[] arr= {2, 2, 1, 0, 1, 0, 2, 1, 1, 0};
		arr=obj.sortArray(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print("\t"+arr[i]);

	}

}
