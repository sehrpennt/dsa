package com.dsa.quicksort;

public class QuickSort {
	
	public static int partition(int[] array, int start, int end) {
		
		//push smaller elements than pivot, to the beginning, by swapping it with array[low]
		
		int pivot=array[end];
		int low=start, temp;
		for(int i=start; i<=end-1; i++) {
			if(array[i] < pivot) {
				temp=array[i];
				array[i]=array[low];
				array[low]=temp;
				low++;
			}
		}
		temp=array[end];
		array[end]=array[low];
		array[low]=temp;
		return low;
	}
	public static void quickSort(int [] array, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivot_index=partition(array, start, end);
		
		quickSort(array, start, pivot_index-1);
		quickSort(array, pivot_index+1, end);
	}

	public static void main(String[] args) {
		int[] array= {64,25,12,22,11,13};
		quickSort(array, 0, 5);
		for(int i=0; i<array.length; i++) {
			System.out.print("\t"+array[i]);
		}
	}

}
