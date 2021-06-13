/*Check if a key is present in every segment of size k in an array
 * 
 * Given an array arr[] and size of array is n and one another key, 
 * and give you a segment size seg_size. The task is to find that the key is present in 
 * every segment of size k in arr[].
 * 
 */
package com.dsa.arrays;

class SolutionArraysKeySegment{
	public boolean isPresent(int[] arr, int key, int seg_size) {
		int flag=0, noseg=0;
		if(arr.length%seg_size == 0) {
			noseg=arr.length/seg_size;
		}
		else {
			noseg=(arr.length/seg_size)+ 1;
		}
		
		
		for(int i=0; i<arr.length; i+=seg_size) {
			for(int j=0; j<seg_size; j++) {
				if((i+j) < arr.length && arr[i+j] == key) {
					flag++;
					break;
				}
				else {
					continue;
				}
			}
			
		}
		if(flag == noseg) {
			return true;
		}
		
		else {
			return false;
		}
	
 }
}




public class ArraysKeySegment{
	public static void main(String[] args) {
		SolutionArraysKeySegment obj = new SolutionArraysKeySegment();
		int[] arr= {5, 8, 7, 12, 14, 3, 9};
		
		System.out.println(obj.isPresent(arr, 8, 2));
	}
}
