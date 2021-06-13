package com.dsa.linkedlist;


class SolutionReversal{
	public static void reverse(LinkedLists.Node A) {
		LinkedLists.Node prev, current, next, node;
		prev=null;
		current=A;
		next=null;
		
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		while(node.next != null) {
			System.out.print("\t"+node.data);
			node=node.next;
		}
		System.out.print("\t"+node.data);
	}
}

public class Reversal {

	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(91);
		list.insert(2);
		list.insert(8);
		list.insertAt(0, 9);
		//list.deleteAt(2);
		list.show();
		System.out.println();
		SolutionReversal.reverse(list.head);
		//System.out.println(list.head.data);

	}

}
