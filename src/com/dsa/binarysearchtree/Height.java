package com.dsa.binarysearchtree;

public class Height {
	
	public static int height(BST.Node root) {
		if(root == null) {
			return -1;
		}
		int leftHeight=height(root.left)+1;
		int rightHeight=height(root.right)+1;
		
		if(leftHeight > rightHeight) {
			return leftHeight;
		}
		else {
			return rightHeight;
		}
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
		System.out.println(height(tree.root));

	}

}
