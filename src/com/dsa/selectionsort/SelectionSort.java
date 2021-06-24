package com.dsa.selectionsort;

class SelectionSortImplementation{
	public static void sort(int[] array) {
		int n=array.length, min, temp=0;
		for(int i=0; i<n-1; i++) {
			min=i;
			for(int j=i+1; j<n; j++) {
				if(array[j] < array[min]) {
					min=j;
				}
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
}

public class SelectionSort {

	public static void main(String[] args) {
		int[] array= {64,25,12,22,11};
		SelectionSortImplementation.sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
