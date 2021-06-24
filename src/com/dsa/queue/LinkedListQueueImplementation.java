package com.dsa.queue;

class LinkedListQueue{
	Node front, temp, node, rear;
	
	class Node{
		int data;
		Node next;
	}
	
	public void enQueue(int data) {
		node = new Node();
		node.data=data;
		if(front == null) {
			front=node;
			rear=node;
		}
		else {
			rear.next=node;
			rear=rear.next;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Empty queue!");
			return;
		}
		front=front.next;
		if(isEmpty()) {
			System.out.println("Empty queue!");
		}
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	
	public void display() {
		temp=front;
		while(temp != null) {
			System.out.print("\t"+temp.data);
			temp=temp.next;
		}
	}
	
	
	
}

public class LinkedListQueueImplementation {

	public static void main(String[] args) {
		LinkedListQueue list = new LinkedListQueue();
		list.enQueue(1);
		list.enQueue(2);
		list.enQueue(3);
		list.enQueue(4);
		list.deQueue();
		list.enQueue(1);
		list.enQueue(2);
		list.enQueue(3);
		list.enQueue(4);
		list.enQueue(5);
		list.deQueue();
		list.display();

	}

}
