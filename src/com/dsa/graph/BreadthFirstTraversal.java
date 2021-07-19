package com.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
	
	public static void BFS(AdjacencyList graph, int root) {
		
		boolean[] visited=new boolean[graph.list.size()];
		bfsutil(graph, root, visited);
		
		//For a disconnected graph (if all vertices aren't reachable from all vertices)
		for(int i=0; i<visited.length; i++) {
			if(!visited[i]) {
				bfsutil(graph, i, visited);
			}
		}
		
	}
	
	public static void bfsutil(AdjacencyList graph, int root, boolean[] visited) {		
		Queue<Integer> q=new LinkedList<>();
		q.add(root);
		visited[root]=true;
		while(!q.isEmpty()) {
			LinkedList<Integer> adjacency=graph.list.get(q.peek());
			
			/*for(int i : adjacency) { --Simple for-each loop --
				if(!visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}*/
			
			Iterator<Integer> i=adjacency.iterator();
			while(i.hasNext()) {
				int vertex=i.next();
				if(!visited[vertex]) {
					q.add(vertex);
					visited[vertex]=true;
				}
			}
			
			System.out.print("\t"+q.remove());
			
		}
		
	}

	public static void main(String[] args) {
		AdjacencyList graph=new AdjacencyList(6);
		graph.addEdge(0, 1); graph.addEdge(1, 0);
		graph.addEdge(0, 2); graph.addEdge(2, 0);
		graph.addEdge(1, 3); graph.addEdge(3, 1);
		graph.addEdge(1, 4); graph.addEdge(4, 1);
		graph.addEdge(2, 4); graph.addEdge(4, 2);
		graph.addEdge(3, 5); graph.addEdge(5, 3);
		graph.addEdge(3, 4); graph.addEdge(4, 3);
		graph.addEdge(5, 4); graph.addEdge(4, 5);
		graph.display();
		BFS(graph, 0);
	}

}
