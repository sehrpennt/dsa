package com.dsa.binarysearchtree;

public class DepthFirst {
	
	public static void preOrder(BST.Node root) {
		if(root == null) {
			return;
		}
		System.out.print("\t"+root.value);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(BST.Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print("\t"+root.value);
		inOrder(root.right);
	}
	
	public static void postOrder(BST.Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print("\t"+root.value);
	}

	public static void main(String[] args) {
		BST tree=new BST();
		tree.insertIterative(5);
		tree.insertIterative(4);
		tree.insertIterative(9);
		tree.insertRecursive(8);
		tree.insertIterative(7);
		tree.insertRecursive(19);
		tree.insertIterative(20);
		preOrder(tree.root);
		System.out.println();
		inOrder(tree.root);
		System.out.println();
		postOrder(tree.root);

	}

}
