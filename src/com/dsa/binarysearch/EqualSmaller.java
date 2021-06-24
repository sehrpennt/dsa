package com.dsa.binarysearch;
/*
 * Given an sorted array A of size N. Find number of elements which are less than or equal to B.
 * NOTE: Expected Time Complexity O(log N)
 */

public class EqualSmaller {
	
	public static int binarySearchCount(int[] A, int B) {
		int left=0, right=A.length-1, mid=0;
		while(left <= right) {
			mid=(left+right)/2;
			if(B >= A[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] array= {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11 ,12, 12 ,13, 14, 15};
		System.out.println(binarySearchCount(array, 12));

	}

}
