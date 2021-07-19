package com.dsa.binarysearchtree;

class BST{
	Node root;
	
	class Node{
		int value;
		Node left;
		Node right;
		public Node(int value) {
			this.value=value;
		}
	}
	
	public Node findMin(Node root) {
		if(root.left == null) {
			return root;
		}
		return findMin(root.left);
	}
	
	public Node deleteRecursive(Node root, int value) {
		if(root == null) {
			System.out.println("Element not found");
			return root;
		}
		if(value < root.value) {
			root.left=deleteRecursive(root.left, value);
		}
		else if(value > root.value) {
			root.right=deleteRecursive(root.right, value);
		}
		else {
			if(root.left == null && root.right == null) {
				return null;
			}
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				Node min=findMin(root.right); //minimum node from the right subtree
				root.value=min.value;
				root.right=deleteRecursive(root.right, min.value);
			}
		}
		return root;
	}
	
	public void deleteIterative(int value) {
		//Complex shit
		if(root == null) {
			return;
		}
		Node node=root;
		Node prev=null;
		while(node != null) {
			prev=node;
			if(value > node.value) {
				node=node.right;
			}
			else if(value < node.value){
				node=node.left;
			}
			
			if(value == node.value){
				break;
			}
		}
		if(node.left == null && node.right == null) {
			if(node.value > prev.value) {
				prev.right=null;
			}
			else{
				prev.left=null;
			}
		}
		else if(node.left == null) {
			if(node.value > prev.value) {
				prev.right=node.right;
			}
			else{
				prev.left=node.right;
			}
		}
		else if(node.right == null) {
			if(node.value > prev.value) {
				prev.right=node.left;
			}
			else{
				prev.left=node.left;
			}			
		}
		
		else {
			Node temp=node.right;
			Node prev2=null;
			while(temp.left != null) {
				prev2=temp;
				temp=temp.left;
			}
			node.value=temp.value;
			
			if(temp.left == null && temp.right == null) {
				prev2.left=null;
			}
			
			else {
				prev2.left=temp.right;
			}
			
		}
		
	}
	
	public boolean searchRecursive(Node node, int value) {
		if(node == null) {
			return false;
		}
		else if(node.value == value) {
			return true;
		}
		else if(value < node.value) {
			return searchRecursive(node.left, value);
		}
		else {
			return searchRecursive(node.right, value);
		}
		
		
		
	}
	
	
	public void searchIterative(int value) {
		if(root == null) {
			System.out.println("Empty tree");
			return;
		}
		if(root.value == value) {
			System.out.println("Found");
			return;
		}
		Node node=root;
		while(node != null) {
			if(value < node.value) {
				node=node.left;
			}
			else if(value > node.value) {
				node=node.right;
			}
			else {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");
	}
	
	public void insertIterative(int value) {
		if(root==null) {
			Node node=new Node(value);
			root=node;
			return;
		}
		Node node=root;
		Node prev=null;
		while(node != null) {
			prev=node;
			if(value <= node.value) {
				node=node.left;
			}
			else {
				node=node.right;
			}
		}
		node=new Node(value);
		if(node.value <= prev.value) {
			prev.left=node;
		}
		else {
			prev.right=node;
		}
	}
	
	public void insertRecursive(int value) {
		root=insertRecursive(value, root);
	}
	
	private Node insertRecursive(int value, Node node) {
		if(node == null) {
			node=new Node(value);
			return node;
		}
		
		if(value <= node.value) {
			node.left=insertRecursive(value, node.left);
		}
		else {
			node.right=insertRecursive(value, node.right);
		}
		return node;
	}
}

public class BSTImplementation {

	public static void main(String[] args) {
			BST tree=new BST();
			tree.insertIterative(5);
			tree.insertIterative(4);
			tree.insertIterative(9);
			tree.insertRecursive(8);
			tree.insertIterative(7);
			tree.insertIterative(20);
			tree.insertIterative(18);
			tree.insertRecursive(22);
			//System.out.println(tree.searchRecursive(tree.root,9));
			System.out.println(tree.root.value);
			//tree.deleteIterative(9);
			tree.deleteRecursive(tree.root,9);
			System.out.println(tree.root.right.right.right.value);
	}

}
