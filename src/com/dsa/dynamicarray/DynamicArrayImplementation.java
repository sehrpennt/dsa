package com.dsa.dynamicarray;

class DynamicArray{
	
	int count;
	int size;
	int[] array;
	
	public DynamicArray() {
		array = new int[1];
		count=0;
		size=1;
	}
	
	public void add(int data) {
		if(count == size) {
			growSize();
		}
			array[count]=data;
			count++;
	}
	
	public void addAt(int index, int data) {
		if(count == size) {
			growSize();
		}
		
			for(int i=count-1; i>=index; i--) {	
				array[i+1]=array[i];
			}
			array[index]=data;
			count++;
			
	}
	
	public void remove() {
		if(count > 0) {
			array[count - 1]= 0;
			count--;			
		}
	}
	
	public void removeAt(int index) {
		if(index<count) {
			for(int i=index; i<count-1;i++) {
				array[i]=array[i+1];
			}
		}
		array[count-1]=0;
		count--;
	}
	
	
	private void growSize() {
		int[] temp = new int[2*size];
		for(int i=0; i<size; i++) {
			temp[i]=array[i];
		}
		array=temp;
		size*=2;
	}
	
	public void shrinkSize() {
		if(count < size && count > 0) {
			int temp[]=new int[count];
			for(int i=0; i<count; i++) {
				temp[i]=array[i];
			}
			array=temp;
			size=count;
		}
	}
	
	public void display() {
		System.out.print("[");
		for(int i=0; i < count; i++) {
			System.out.print("\t"+array[i]);
		}
		System.out.print("\t]");
	}
	
}

public class DynamicArrayImplementation {

	public static void main(String[] args) {
		
		DynamicArray arr = new DynamicArray();
		arr.remove();
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(9);
		arr.remove();
		arr.remove();
		arr.addAt(0,8);
		arr.add(7);
		arr.removeAt(0);
		arr.removeAt(2);
		arr.add(19);
		arr.add(20);
		arr.add(21);
		arr.shrinkSize();
		arr.display();
		System.out.println(arr.array.length);
		
	}

}
