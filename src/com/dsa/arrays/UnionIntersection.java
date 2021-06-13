package com.dsa.arrays;
//Given two sorted arrays, find their union and intersection.
class SolutionUnionIntersection{
	public static void union(int[] arr1, int[] arr2) {
		int max_element=0;
		
		if(arr1[arr1.length-1] > arr2[arr2.length-1]) {
			max_element=arr1[arr1.length-1];
		}
		else {
			max_element=arr2[arr2.length-1];
		}
		
		int[] elements_as_index = new int[max_element];
		
		for(int i=0; i<arr1.length; i++) {
			elements_as_index[arr1[i]-1]++;
		}
		
		for(int i=0; i<arr2.length; i++) {
			elements_as_index[arr2[i]-1]++;
		}
		
		for(int i=0; i<elements_as_index.length; i++) {
			if(elements_as_index[i] > 0) {
				System.out.print("\t"+(i+1));
			}
		}
		
	} 

	
	public static void inter(int[] arr1, int[] arr2) {
		int i=0, j=0, max=0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				if(arr1[i] != max) {
					System.out.print("\t"+arr1[i]);
					max=arr1[i];
				}
					i++;
					j++;
			}
			else if(arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
	}
}

public class UnionIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 2, 3, 4};
		int[] arr2= {2, 2, 4, 6, 7, 8};
		System.out.print("UNION \t");
		SolutionUnionIntersection.union(arr1, arr2);
		System.out.println();System.out.println();
		System.out.print("INTERSECTION \t");
		SolutionUnionIntersection.inter(arr1, arr2);
	}

}
