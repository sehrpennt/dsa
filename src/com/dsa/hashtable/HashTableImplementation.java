package com.dsa.hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



class HashTable <K,V>{
	int num_buckets;
	List<HashNode> array;
	int size, buckets;
	final double LOAD_FACTOR=0.2;
	
	class HashNode{
		HashNode next;
		K key;
		V value;
		int hash;
		public HashNode(K key, V value, int hash) {
			this.key=key;
			this.value=value;
			this.hash=hash;
		}
	}
	
	public HashTable(int length) {
		array=new ArrayList<>();
		buckets=length;
		for(int i=0; i<length; i++) {
			array.add(i,null);
		}
	}
	
	public int hashCode(K key) {
		return Objects.hashCode(key);
	}
	
	public int indexGenerate(int hash) {
		return hash%buckets;
	}
	
	public void growSize() {
		List<HashNode> backup=array;
		array=new ArrayList<>();
		buckets*=2;
		System.out.print("\t"+buckets);
		for(int i=0; i<buckets; i++) {
			array.add(null);
		}
		size=0;
		for(HashNode i : backup) {
			while(i != null) {
				addExisting(i.key, i.value, i.hash);
				i=i.next;
			}
		}
	}
	
	private void addExisting(K key, V value, int hash) {
		/*
		 * So that you don't need to compute hash code again by running hashCode() method while
		 * growing the array size.
		 */
		int index=indexGenerate(hash);
		HashNode node=new HashNode(key, value, hash);
		HashNode head=array.get(index);
		
		if(head == null) {
			size++;
			array.remove(index);
			array.add(index, node);
		}
		else {
			node.next=head;
			array.remove(index);
			array.add(index, node);
		}
	}
	
	public void add(K key, V value) {
		
		int hash=hashCode(key);
		int index=indexGenerate(hash);
		HashNode node=new HashNode(key, value, hash);
		HashNode head=array.get(index);
		
		if(head == null) {
			size++;
			array.remove(index);
			array.add(index, node);
		}
		else {
			node.next=head;
			array.remove(index);
			array.add(index, node);
		}
		
		
	
	 	if((double)size/buckets >= LOAD_FACTOR) {
			growSize();
		}
		
	}
	
	public V get(K key) {
		int hash=hashCode(key);
		int index=indexGenerate(hash);
		HashNode head=array.get(index);
		while(head != null) {
			if(head.hash == hash && head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public void remove(K key) {
		int hash=hashCode(key);
		int index=indexGenerate(hash);
		HashNode head=array.get(index);
		HashNode temp;
		
		if(head == null) {
			System.out.println("No such key exist");
			return;
		}
		
		if(head.hash == hash && head.key.equals(key)) {
			array.remove(index);
			array.add(index, head.next);
			if(head.next == null){
				size--;
			}
			head=null;
			return;
		}
		temp=head;
		head=head.next;
		while(head != null) {
			if(head.hash == hash && head.key.equals(key)) {
				temp.next=head.next;
				head=null;
				return;
			}
			temp=head;
			head=head.next;
			
		}
		System.out.println("No such key exist");
	}
}


public class HashTableImplementation {
	public static void main(String[] args) {
		HashTable<String, Integer> map=new HashTable<>(10);
		map.add("KILLS", 4);
		map.add("AGE", 23);
		map.add("ROLL", 21);
		map.add("NAME", 47);
	    //map.add("BLOOD", 32);
	    //map.remove("BLOOD");
	    System.out.println();
	    System.out.println(map.get("KILLS"));
	    System.out.println(map.size);
	    System.out.println(map.buckets);
	}

}
