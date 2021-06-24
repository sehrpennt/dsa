package com.dsa.linkedlist;

class LinkedLists{
	Node head;
	int size=0;
	
	class Node{
		public Node(int data) {
			this.data=data;
		}
		int data;
		Node next;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head=node;
		}
		else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=node;	
		}
		size++;
	}
	
	public void show() {
		Node node= head;
		while(node.next != null) {
		System.out.print("\t"+node.data);
		node=node.next;
		}
		System.out.print("\t"+node.data);
	}
	
	
	
	public void insertAt(int index, int data) {
		Node node = new Node(data);
		Node current=head;
		
		if(index >= size) {
			System.out.println("Check your input ");
			return;
		}

		if(index == 0) {
			node.next=head;
			head=node;
		}
		else {
		for(int i=1; i < index; i++) {
			current=current.next;
			}
		node.next=current.next;
		current.next=node;
		}
		size++;
		}
	
	public void deleteAt(int index) {
		Node current=head;
		
		if(index >= size) {
			System.out.println("Check your input ");
			return;
		}
	
		if(index == 0){
			head=current.next;
		}
		else {
		for(int i=1; i<index; i++) {
			current=current.next;
		}
		current.next=current.next.next;
		}
		size--;
	}
	
		
}


public class LinkedListImplementation {

	public static void main(String[] args) {
		
		LinkedLists list = new LinkedLists();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insertAt(0, 9);
		list.deleteAt(2);
		list.show();

	}

}
