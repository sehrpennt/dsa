package com.dsa.linkedlist;

class SolutionPalindrome{
		public static void isPalindrome(LinkedLists.Node A) {
		LinkedLists.Node temp, next, prev, current, reversed_first;
		int size=1, mid=0, check=0;
		temp=A;
		while(temp.next != null) {
			temp=temp.next;
			size++;
		}
		
		if(size == 3) {
			if(A.data != temp.data) {
				System.out.println("NO");
				return;
			}
		}
		
		if(size%2 == 0) {
			mid=(size/2)+1;
			check=mid;
		}
		else {
			mid=(size/2)+2;
			check=mid-1;
		}
		
		temp=A;
		for(int i=1; i<mid; i++) {
			temp=temp.next;
		}
		
		next=null;
		current=temp;
		prev=null;
		
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		reversed_first=prev;
		
		for(int i=1; i<check; i++) {
			if(A.data != reversed_first.data) {
				System.out.println("NO");
				return;
			}
			else {
				A=A.next;
				reversed_first=reversed_first.next;
				System.out.println(A.data+" "+reversed_first.data);
			}
		}
		System.out.println("YES");
		
		
}
}

public class Palindrome {

	public static void main(String[] args) {
		LinkedLists list = new LinkedLists();
		list.insert(1);
		list.insert(1);
		list.insert(6);
		list.insert(4);
		list.insert(1);
		//list.insert(3);
		
		//list.insertAt(0, 9);
		//list.deleteAt(2);
		list.show();
		System.out.println();
		SolutionPalindrome.isPalindrome(list.head);
	}

}
