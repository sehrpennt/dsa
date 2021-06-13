package com.dsa.linkedlist;
/*
 * Given a Linked List and a number n, 
 * write a function that returns the value at the n’th node from the end of the Linked List.
 */

class SolutionNthNode{
	public static void getNode(LinkedLists.Node headnode, int N) {
		if(N == 0) {
			System.out.println("Invalid Input");
			return;
		}
		int size=1;
		LinkedLists.Node temp;
		temp=headnode;
		while(temp.next != null) {
			temp=temp.next;
			size++;
		}
		
		if(N > size) {
			System.out.println("Input greater than size");
			return;
		}
		temp=headnode;
		for(int i=0; i<size-N; i++) {
			temp=temp.next;
		}
		System.out.println(N+"th Node from end is: "+temp.data);
	}
	
	public static void getMid(LinkedLists.Node headnode) {
		int size=1; int index=0;
		LinkedLists.Node temp;
		temp=headnode;
		while(temp.next != null) {
			temp=temp.next;
			size++;
		}
		temp=headnode;
		index=(size/2)+1;
			for(int i=0; i<index-1; i++) {
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	
	//nth node towards head from mid.
	public static int nodeFromMid(LinkedLists.Node A, int B) {
		LinkedLists.Node temp;
		temp=A; int N=1, mid=0;
		while(temp.next != null) {
			temp=temp.next;
			N++;
		}
		temp=A;
		mid=(N/2)+1;
		if(B >= mid) {
			return -1;
		}

		for(int i=1; i<mid-B; i++) {
			temp=temp.next;
		}
		
		return temp.data;		
	}
	
	//using 2 pointers
	public static void getMid2(LinkedLists.Node node) {
		LinkedLists.Node fast, slow;
		fast=node;
		slow=node;
		while(slow.next != null && fast.next != null && fast.next.next !=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast.next == null) {
			System.out.println(slow.data);
		}
		else {
			System.out.println(slow.next.data);
		}
		
	}
	}

public class NthNode {

	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.insert(5);
		list.insert(6);
		//list.insert(7);
		list.insert(91);
		list.insert(2);
		list.insert(8);
		list.insertAt(0, 9);
		//list.deleteAt(2);
		list.show();
		System.out.println();System.out.println();
		System.out.println(SolutionNthNode.nodeFromMid(list.head, 4));
		SolutionNthNode.getMid2(list.head);

	}
	

}
