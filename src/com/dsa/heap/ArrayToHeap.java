package com.dsa.heap;

public class ArrayToHeap {
	public static void buildHeap(int[] heap) {
		int n=heap.length;
		int leaves=(n+1)/2; //no: of leaf nodes = floor((n+1)/2)
		int non_leaves=n-leaves;
		
		for(int i=non_leaves-1; i>=0; i--) {
			heapify(heap, i);
		}
		
	}
	
	public static void heapify(int[] heap, int root) {
		int n=heap.length;
		int largest=root;
		int left=2*root+1;
		int right=2*root+2;
		
		if(left<n && heap[left]>heap[largest]) {
			largest=left;
		}
		if(right<n && heap[right]>heap[largest]) {
			largest=right;
		}
		
		if(largest == root) {
			return;
		}
		int temp=heap[largest];
		heap[largest]=heap[root];
		heap[root]=temp;
		
		heapify(heap, largest);
		
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		buildHeap(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
	}
}
