package com.dsa.bubblesort;

class BubbleSortImplementation{
	public static void sort(int[] array) {
		int temp, n=array.length;
		boolean swap=true; //(Optimized bubble sort) stop iteration if one iteration without swapping
		for(int i=0; i<n-1; i++) { //passes
			if(swap == false) {
				break;
				}
			for(int j=0; j<n-1-i; j++) { //iterations
				swap=false;
				if(array[j] > array[j+1]) {
					swap=true;
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		int[] array= {2,1,3,4,5, 9, 27, 6, 9, 8};
		BubbleSortImplementation.sort(array);
		for(int i=0; i<array.length; i++) {
			System.out.print("\t"+array[i]);
		}

	}

}
