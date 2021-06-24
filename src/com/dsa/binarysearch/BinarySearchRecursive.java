package com.dsa.binarysearch;

public class BinarySearchRecursive {

	public static int binarySearch(int[] array, int key, int left, int right) {
		
		int mid=(left+right)/2;
		
		if(left > right) {
			return -1;
		}
		if(key == array[mid]) {
			return mid;
		}
		else if(key > array[mid]) {
			return binarySearch(array, key, mid+1, right);
		}
		else{
			return binarySearch(array, key, left, mid-1);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7,8};
		System.out.println(binarySearch(array, 6, 0, 6));
		
	}

}
