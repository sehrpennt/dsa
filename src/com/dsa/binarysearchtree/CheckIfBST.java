package com.dsa.binarysearchtree;

class BinaryTree{
	Node root;
	class Node{
		int value;
		Node left;
		Node right;
		public Node(int value) {
			this.value=value;
		}
	}
}

public class CheckIfBST {
	public static boolean isLesser(BinaryTree.Node root, int value) {
		if(root == null) {
			return true;
		}
		return value >= root.value && isLesser(root.left, value) && isLesser(root.right, value);
		
	}
	public static boolean isGreater(BinaryTree.Node root, int value) {
		if(root == null) {
			return true;
		}
		return value < root.value && isGreater(root.left, value) && isGreater(root.right, value);
		
	}
	//O(N^2) solution below
	public static boolean isBST(BinaryTree.Node root) {
		if(root == null) {
			return true;
		}
		return isLesser(root.left, root.value) && isGreater(root.right, root.value) && 
				isBST(root.left) && isBST(root.right);
	}
	
	//O(N) solution below.
	public static boolean isBST2(BinaryTree.Node root, int min, int max) {
		if(root == null) {
			return true;
		}
		return root.value <= max && root.value >= min && 
				isBST2(root.left, min, root.value) && isBST2(root.right, root.value, max);
	}
	
	//From InOrder traversal
	static int prev=Integer.MIN_VALUE;
	public static boolean isBST3(BinaryTree.Node root) {
		if(root == null) {
			return true;
		}
		if(isBST3(root.left) && root.value >=prev) {
			prev=root.value;
			return(isBST3(root.right));
		}
		return false;
		
	}

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree(); 
		/*
		BinaryTree.Node node1=tree.new Node(5);
		BinaryTree.Node node2=tree.new Node(4);
		BinaryTree.Node node3=tree.new Node(7);
		tree.root=node1;
		node1.left=node2;
		node1.right=node3;*/
		
		tree.root = tree.new Node(4);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(5);
        tree.root.left.left = tree.new Node(1);
        tree.root.left.right = tree.new Node(3);
		
		System.out.println(isBST(tree.root));
		System.out.println(isBST2(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println(isBST3(tree.root));
	}

}
