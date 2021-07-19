package com.dsa.binarysearchtree;

public class InorderSuccessor {
	
	public static void inorderSuccessor(BST.Node root, int value) {
		if(root == null) {
			return;
		}
		BST.Node prev=root;
		while(root != null) {
			if(value < root.value) {
	//"prev" keep track of the nearest ancestor for which, the node would be in the left subtree
				prev=root;
				root=root.left;
			}
			else if(value > root.value) {
				root=root.right;
			}
			if(value == root.value) {
				break;
			}
		}
		if(root.right == null) {
			System.out.println(prev.value);
		}
		else {
			BST.Node temp=root.right;
			while(temp.left!=null) {
				temp=temp.left;
			}
			System.out.println(temp.value);
		}
	}

	public static void main(String[] args) {
		BST tree=new BST();
		tree.insertIterative(15);
		tree.insertIterative(10);
		tree.insertIterative(20);
		tree.insertRecursive(8);
		tree.insertIterative(12);
		tree.insertRecursive(16);
		tree.insertIterative(25);
		inorderSuccessor(tree.root,8);

	}

}
