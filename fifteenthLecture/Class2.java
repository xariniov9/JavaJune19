package fifteenthLecture;

import java.util.*;

public class Class2 {
	
	// topological sort!
	public static void dfs(int node, int [] vis, ArrayList<ArrayList<Integer>> graph) {
		if(vis[node] == 1) {
			return;
		}
		vis[node] = 1;
		for(int i=0; i<graph.get(node).size(); i++) {
			dfs(graph.get(node).get(i), vis, graph);
		}
		// idealy add to head of linkedlist!
		System.out.println(node);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int [][] edges = {{2, 1}, {1, 3}, {3, 6}, {5, 4}, {5, 1}, {0, 3}, {0, 5}};
		
		ArrayList<ArrayList<Integer> > graph = new ArrayList<>();
		for(int i=0; i<n; i++)
			graph.add(new ArrayList<Integer>());
		
		for(int i=0; i<edges.length; i++) {
			graph.get(edges[i][0]).add(edges[i][1]);
		}
		
		int [] visited = new int[n];
		
		for(int i=0; i<n; i++) {
			if(visited[i] == 0) {
				dfs(i, visited, graph);
			}
		}
		
	}

}
