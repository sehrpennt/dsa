package com.dsa.stack;
/* 
 * Dynamic Array implementation of Stack
 */

class Stacks{
	int[] array, temp;
	int top=-1, size;	
	
	public Stacks() {
		array = new int[1];
		size=1;
	}
	public void push(int data) {
		if(top+1 >= size) {
			temp=new int[size*2];
			for(int i=0; i<size; i++) {
				temp[i]=array[i];
			}
			size=size*2;
			array=temp;
		}
		
		if(top+1 >= array.length) {
			System.out.println("Stack Overflow Error");
			return;
		}
		top++;
		array[top]=data;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack Underflow Error");
			return -1;
		}
		int temp=array[top];
		array[top]=0;
		top--;
		shrinkSize();
		return temp;
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peek() {
		return array[top];
	}
	
	public void display() {
		for(int i=0; i<=top; i++) {
			System.out.print("\t"+array[i]);
		}
	}
	
	public void shrinkSize() {
		if(top+1 < size) {
			temp = new int[top+1];
			for(int i=0; i<=top; i++) {
				temp[i]=array[i];
			}
			size=top+1;
			array=temp;
		}
	}
}

public class StackImplementation {
	public static void main(String[] args) {
		Stacks stack = new Stacks();
		//System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(6);
		stack.push(8);
		stack.push(5);
		stack.push(6);
		stack.push(8);
		stack.push(9);
		stack.push(9);		
		//System.out.println(stack.pop());
		//System.out.println(stack.peek());
		//System.out.println(stack.size());
		//System.out.println(stack.isEmpty());
		//stack.shrinkSize();
		stack.pop();
		System.out.println(stack.array.length);
		stack.display();
		
	}
}
