package com.dsa.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
	public static void levelOrder(BST.Node root) {
		Queue<BST.Node> q=new LinkedList<>();
		BST.Node node;
		q.add(root);
		while(!q.isEmpty()) {
			node=q.peek();
			if(node.left != null) {
				q.add(node.left);
			}
			if(node.right != null) {
				q.add(node.right);
			}
			System.out.print("\t"+q.remove().value);
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
		levelOrder(tree.root);

	}

}
