package com.dsa.queue;

class CircularQueues{
	int front;
	int rear;
	int size;
	int[] array;
	public CircularQueues(int n){
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
		rear=(rear+1)%array.length;
		array[rear]=data;
		if(size < array.length) {
			size++;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Empty queue!");
			System.exit(0);
		}
		array[front]=0;
		front=(front+1)%array.length;
		size--;
	}
	
	public boolean isEmpty() {
		return (rear == -1);
	}
	
	public boolean isFull() {
		return size == array.length;
	}
	
	public void display() {
		for(int i=front; i<size+front; i++) {
			System.out.print("\t"+array[i%array.length]);
		}
	}
	
	
}

public class CircularQueueImplementation {

	public static void main(String[] args) {
		CircularQueues q = new CircularQueues(5);
		
		//q.deQueue();
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
		//q.enQueue(11);
		q.deQueue();
		q.enQueue(11);
		q.display();
		System.out.println();

	}

}
