package com.dsa.linkedlist;

/*
 * Given a singly linked list and a key, count the number of occurrences of the given key 
 * in the linked list. For example,if the given linked list is 1->2->1->2->1->3->1 
 * and the given key is 1, then the output should be 4.
 */

class SolutionCounter{
	public static int count(LinkedLists.Node head, int key) {
		int count=0;
		while(head.next != null) {
			if(head.data == key) {
				count++;
			}
			head=head.next;
		}
		if(head.data == key) {
			count++;
		}
		return count;
	}
}

public class Counter {

	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.insert(1);
		list.insert(1);
		list.insert(6);
		list.insert(4);
		list.insert(1);
		list.insert(6);
		list.insert(4);
		list.insert(1);
		System.out.println(SolutionCounter.count(list.head, 4));

	}

}
