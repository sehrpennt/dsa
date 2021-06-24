package com.dsa.linkedlist;

class CircularLinkedList{
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public void insert(int data) {
		Node node= new Node(data);
		size++;
		if(head == null) {
			head=node;
			head.next=head;
			return;
		}
		Node temp=head;
		while(temp.next != head) {
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
	}
	
	public void insertAt(int index, int data) {
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		if(index == 0) {
			insertFront(data);
			return;
		}
		if(index > size) {
			System.out.println("Invalid Index");
			return;
		}
		if(index == size) {
			insert(data);
			return;
		}
		size++;
		Node temp=head;
		Node node=new Node(data);
		for(int i=1; i<index; i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		
	}
	
	public void insertFront(int data) {
		if(head == null) {
			insert(data);
			return;
		}
		size++;
		Node node=new Node(data);
		Node temp=head;
		while(temp.next != head) {
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
		head=node;
	}
	
	public void delete() {
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		size--;
		Node temp=head;
		while(temp.next.next != head) {
			temp=temp.next;
		}
		temp.next=head;
		
	}
	
	public void deleteFront() {
		if(head == null) {
			return;
		}
		size--;
		Node temp = head;
		while(temp.next != head) {
			temp=temp.next;
		}
		head=temp.next.next;
		temp.next=head;
	}
	
	public void deleteAt(int index) {
		if(head == null) {
			return;
		}
		if(index >= size) {
			System.out.println("Invalid Index");
			return;
		}
		if(index == 0) {
			deleteFront();
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
		temp.next=temp.next.next;
		
		
		
	}
	
	public void display() {
		Node temp=head;
		while(temp.next != head) {
			System.out.print("\t"+temp.data);
			temp=temp.next;
		}
		System.out.print("\t"+temp.data);
	}
	
	
}

public class CircularLinked {

	public static void main(String[] args) {
		CircularLinkedList list= new CircularLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertFront(0);
		list.insertAt(1, 9);
		list.insertAt(2, 8);
		list.insertAt(6, 7);
		//list.delete();
		list.deleteFront();
		list.deleteAt(4);
		list.display();
		System.out.println();
		//System.out.println(list.head.data);
		//list.reverseDisplay();

	}

}
