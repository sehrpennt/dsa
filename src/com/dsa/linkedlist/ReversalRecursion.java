package com.dsa.linkedlist;


public class ReversalRecursion {

	public static LinkedLists.Node reverse(LinkedLists.Node current) {
				
		if(current.next == null) {
			return current;
		}
		LinkedLists.Node next=current.next;
		LinkedLists.Node head=reverse(next);//last element will be stored as head
		next.next=current;
		current.next=null;
		return head;//returns the head
		
	}
	
	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(91);
		list.insert(2);
		list.insert(8);
		list.insertAt(0, 9);
		list.show();
		System.out.println();
		System.out.println(reverse(list.head).data);
	}

}
