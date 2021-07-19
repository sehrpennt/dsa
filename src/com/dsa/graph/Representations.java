package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class EdgeList{
	List<List<Integer>> edgelist = new ArrayList<>();
	public void addEdge(int v1, int v2) {
		List<Integer> list=new ArrayList<>();
		list.add(v1);
		list.add(v2);
		edgelist.add(list);
	}
	
	public void deleteEdge(int v1, int v2) {
		for(int i=0; i<edgelist.size(); i++) {
			if(edgelist.get(i).contains(v1) && edgelist.get(i).contains(v2)) {
				edgelist.remove(i);
			}
		}
	}
	
	public void display() {
		for(List<Integer> item : edgelist) {
			System.out.println(item.get(0)+" "+item.get(1));
		}
	}
	
}


class AdjacencyMatrix {
	int[][] matrix;
	int vertices;
	public AdjacencyMatrix(int vertices) {
		this.vertices=vertices;
		matrix=new int[vertices][vertices];
	}
	
	public void addEdge(int v1, int v2) {
		matrix[v1][v2]=1;
	}
	
	public void deleteEdge(int v1, int v2) {
		matrix[v1][v2]=0;
	}
	
	public void display() {
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++) {
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
	}
}

class AdjacencyList{
	List<LinkedList<Integer>> list;
	int vertices;
	public AdjacencyList(int vertices) {
		this.vertices=vertices;
		list=new ArrayList<>();
		for(int i=0; i<vertices; i++) {
			list.add(new LinkedList<>());
		}
	}
	public void addEdge(int v1, int v2) {
		list.get(v1).addFirst(v2);
	}
	public void deleteEdge(Integer v1, Integer v2) {
		list.get(v1).remove(v2);//if the args were of 'int', the remove method removes at index.
	}
	public void display() {
		for(int i=0; i<vertices; i++) {
			System.out.println(list.get(i));
		}
	}
}

public class Representations{
	public static void main(String[] args) {
		EdgeList edgelist=new EdgeList();
		edgelist.addEdge(1, 2);
		edgelist.addEdge(1, 5);
		edgelist.addEdge(4, 3);
		edgelist.deleteEdge(4, 3);
		edgelist.display();
		
		AdjacencyMatrix matrix=new AdjacencyMatrix(5);
		matrix.addEdge(1, 2);
		matrix.addEdge(2, 1);
		matrix.addEdge(4, 3);
		matrix.addEdge(3, 4);
		matrix.deleteEdge(3,4);
		matrix.display();
		
		AdjacencyList list=new AdjacencyList(4);
		list.addEdge(0, 2);
		list.addEdge(1, 2);
		list.addEdge(2, 1);
		list.addEdge(2, 3);
		list.addEdge(2, 0);
		list.addEdge(3, 2);
		list.deleteEdge(2, 1);
		list.display();
		

	}
}
