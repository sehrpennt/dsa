package com.dsa.graph;


public class DepthFirstTraversal {
	public static void DFS(AdjacencyList graph, int root) {
		boolean[] visited=new boolean[graph.list.size()];
		dfsutil(graph, root, visited);
		
		//For a disconnected graph (if all vertices aren't reachable from all vertices)
		for(int i=0; i<visited.length; i++) {
			if(!visited[i]) {
				dfsutil(graph, i, visited);
			}
		}
	}
	
	public static void dfsutil(AdjacencyList graph, int root, boolean[] visited) {
		if(graph.list.get(root)==null || visited[root]==true) {
			return;
		}
		visited[root]=true;
		System.out.print("\t"+root);
		for(int i : graph.list.get(root)) {
			dfsutil(graph, i, visited);
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
		
		DFS(graph, 2);
	}

}
