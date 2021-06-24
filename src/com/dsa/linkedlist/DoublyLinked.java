package com.dsa.linkedlist;

class DoublyLinkedList{
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public void insert(int data) {
		Node node= new Node(data);
		size++;
		if(head == null) {
			node.prev=null;
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		node.prev=temp;
		temp.next=node;
			
	
	}
	
	public void insertAt(int index, int data) {
		Node temp=head;
		if(index > size) {
			System.out.println("Invalid Index");
			return;
		}
		Node node = new Node(data);
		if(index == size) {
			insert(data);
			return;
		}
		
		size++;
		
		if(index == 0) {
			insertFront(data);
			return;
		}
		for(int i=0; i<index; i++) {
			temp=temp.next;
		}
		Node prev=temp.prev;
		temp.prev.next=node;
		temp.prev=node;
		node.next=temp;
		node.prev=prev;
		
	}
	
	public void insertFront(int data) {
		Node node = new Node(data);
		size++;
		if(head == null) {
			insert(data);
			return;
		}
		node.next=head;
		head.prev=node;
		head=node;
	}
	
	public void delete() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		size--;
		Node temp=head;
		while(temp.next.next != null) {
			temp=temp.next;
		}
		temp.next=null;
			
	}
	
	public void deleteFront() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		size--;
		head=head.next;
		head.prev=null;
	}
	
	public void deleteAt(int index) {
		if(head == null || index==0) {
			deleteFront();
			return;
		}
		if(index >= size) {
			System.out.println("Invalid Index");
			return;
		}
		
		if(index == size-1) {
			delete();
			return;
		}
		size--;
		Node temp=head;
		for(int i=1; i<index; i++) {
			temp=temp.next;
		}
		Node next_node=temp.next.next;
		temp.next=temp.next.next;
		next_node.prev=temp;
	}
	
	public void display() {
		Node temp=head;
		while(temp != null) {
			System.out.print("\t"+temp.data);
			temp=temp.next;
		}
	}
	
	public void reverseDisplay() {
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		while(temp != null) {
			System.out.print("\t"+temp.data);
			temp=temp.prev;
		}
	}
	
}

public class DoublyLinked {
	public static void main(String[] args) {
		DoublyLinkedList list= new DoublyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertFront(0);
		list.insertAt(1, 9);
		list.insertAt(2, 8);
		list.insertAt(6, 7);
		//list.delete();
		//list.deleteFront();
		//list.deleteAt(3);
		list.display();
		System.out.println();
		System.out.println();
		list.reverseDisplay();
	}
}
