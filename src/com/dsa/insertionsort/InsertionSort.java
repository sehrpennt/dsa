package com.dsa.insertionsort;

class InsertionSortImplementation{
	public static void sort(int[] array) {
		int key, n=array.length;
		for(int i=1; i<n; i++) {
			key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
	}
}

public class InsertionSort {

	public static void main(String[] args) {
		int[] array= {1,5,3,8,9,2,7,4};
		InsertionSortImplementation.sort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.print("\t"+array[i]);
		}

	}

}
