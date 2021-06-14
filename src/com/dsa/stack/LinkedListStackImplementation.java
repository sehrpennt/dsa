package com.dsa.stack;

class LinkedListStack{
	Node head;
	class Node{
		int data;
		Node next;
	}
	public LinkedListStack() {
		head=null;
	}
	
	public void push(int data) {
		Node temp = new Node();
		temp.data=data;
		
		temp.next=head;
		head=temp;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void peek() {
		System.out.println(head.data);
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("STACK UNDERFLOW ERROR");
			System.exit(0);
		}
		head=head.next;
		
	}
	
	public void size() {
		int size=0;
		Node temp = new Node();
		temp=head;
		while(temp != null) {
			temp=temp.next;
			size++;
		}
		System.out.println(size);
	}
	
	public void display() {
		Node temp = new Node();
		temp=head;
		while(temp != null) {
		System.out.println(temp.data);
		temp=temp.next;
		}
}
}

public class LinkedListStackImplementation {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.pop();
		stack.display();
		System.out.println();
		stack.peek();
		System.out.println(stack.isEmpty());
		stack.size();


	}

}
