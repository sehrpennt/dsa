package com.dsa.binarysearch;

public class BinarySearchIterative {
	public static int binarySearch(int[] array, int key) {
		int left=0, right=array.length-1, mid=0;
		while(left <= right) {
		mid=(left+right)/2;
		if(key == array[mid]) {
			return mid;
		}
		else if(key > array[mid]) {
			left=mid+1;
		}
		else {
			right=mid-1;
		}
	}
		return -1;
}
	
	public static void main(String[] args) {
		
		int[] array= {1, 2, 3, 4, 5, 6};
		System.out.println(binarySearch(array, 6));
	}

}
