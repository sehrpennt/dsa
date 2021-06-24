package com.dsa.queue;

class Queues{
	int front;
	int rear;
	int size;
	int[] array;
	public Queues(int n){
		front=0;
		rear=-1;
		size=0;
		array = new int[n];
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Full queue!");
			System.exit(0);
		}
		rear++;
		array[rear]=data;
		size++;
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Empty queue!");
			System.exit(0);
		}
		array[front]=0;
		front++;
		size--;
	}
	
	public boolean isEmpty() {
		return (rear == -1);
	}
	
	public boolean isFull() {
		return rear+1 == array.length;
	}
	
	public void display() {
		for(int i=front; i<=rear; i++) {
			System.out.print("\t"+array[i%array.length]);
		}
	}
}

public class QueueImplementation {
	public static void main(String[] args) {
		Queues q = new Queues(5);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.enQueue(9);
		q.deQueue();
		q.display();
	}
	
}
