package com.dsa.heap;

//MinHeap is just opposite to MaxHeap
class MaxHeap{
	int[] heap;
	int size;
	int length;
	public MaxHeap(int size) {
		this.size=size;
		heap=new int[size];
	}
	
	public void insert(int data) {
		if(length >= size) {
			System.out.println("Heap Full");
			return;
		}
		if(length == 0) {
			heap[length]=data;
			length++;
			return;
		}
		heap[length]=data;
		int index=length;
		length++;
		
		int parent=(index-1)/2;
		while(heap[index] > heap[parent]) {
			int temp=heap[index];
			heap[index]=heap[parent];
			heap[parent]=temp;
			
			index=parent;
			parent=(index-1)/2;
		}
		
	}
	
	public void deleteRoot() {
		
		if(length == 0) {
			return;
		}
		int root=0;
		int deleted=heap[root];
		heap[root]=heap[length-1];
		length--;
		
		int left=2*root+1;
		int right=2*root+2;
				
		int large=heap[left]>heap[right]?left:right;
		while(large < length && root < length && heap[root] < heap[large]) {
			int temp=heap[large];
			heap[large]=heap[root];
			heap[root]=temp;
			
			root=large;
			left=2*root+1;
			right=2*root+2;
			large=left>right?left:right;
		}
		heap[length]=deleted;
	}
	
	public void heapSort() {
		int temp=length;
		for(int i=0; i<temp; i++) {
			deleteRoot();
		}
		for(int i=0; i<temp; i++) {
			System.out.print("\t"+heap[i]);
		}
	}
	
	public void display() {
		for(int i=0; i<length; i++) {
			System.out.print("\t"+heap[i]);
		}
	}
}

public class HeapImplementation {

	public static void main(String[] args) {
		MaxHeap maxheap=new MaxHeap(6);
		maxheap.insert(1);
		maxheap.insert(2);
		maxheap.insert(9);
		maxheap.insert(4);
		maxheap.insert(8);
		maxheap.insert(6);
		
		maxheap.deleteRoot();
		//maxheap.heapSort();
	
		

		maxheap.display();

	}

}
