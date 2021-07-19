package com.dsa.binarysearchtree;

public class MinMax {
	public static BST.Node findMaxIterative(BST.Node root) {
		while(root != null && root.right != null) {
			root=root.right;
		}
		return root;
	}
	public static BST.Node findMinIterative(BST.Node root) {
		while(root != null && root.left != null) {
			root=root.left;
		}
		return root;
	}
	
	public static BST.Node findMaxRecursive(BST.Node root) {
		if(root == null || root.right == null) {
			return root;
		}
		BST.Node max=findMaxRecursive(root.right);
		return max;
	}
	public static BST.Node findMinRecursive(BST.Node root) {
		if(root == null || root.left == null) {
			return root;
		}
		BST.Node min=findMinRecursive(root.left);
		return min;
	}
	
	public static void main(String[] args) {
		BST tree=new BST();
		tree.insertIterative(5);
		tree.insertIterative(4);
		tree.insertIterative(9);
		tree.insertRecursive(8);
		tree.insertIterative(7);
		tree.insertRecursive(19);
		System.out.println(findMaxRecursive(tree.root).value);
		System.out.println(findMaxIterative(tree.root).value);
		System.out.println(findMinRecursive(tree.root).value);
		System.out.println(findMinIterative(tree.root).value);
	}

}
