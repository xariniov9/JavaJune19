package fourteenthLecture;

import java.util.*;
public class Class2 {

	public static int height(TreeNode<Integer> root) {
		int h = 0;
		for(int i=0; i < root.children.size(); i++) {
			h = Math.max(h, 1 + height(root.children.get(i)));
		}
		return h;
	}
	
	// depth first search!
	public static int height(int node, int parent, ArrayList<ArrayList<Integer>> tree) {
		int h = 0;
		for(int i=0; i < tree.get(node).size(); i++) {
			int curChild = tree.get(node).get(i);
			if(curChild != parent)
				h = Math.max(h, height(curChild, node, tree) + 1);
		}
		return h;
	}
	
	// calculates parent of each node and size of each subtree 
	public static int [] par = new int [9];
	public static int [] sz = new int [9];
	
	public static void dfs (int root, int parent, ArrayList<ArrayList<Integer>> tree) {
		par[root] = parent;
		sz[root] = 1;
		for(int i=0; i < tree.get(root).size(); i++) {
			int curChild = tree.get(root).get(i);
			if(curChild != parent) {
				dfs(curChild, root, tree);
				sz[root] += sz[curChild];
			}
		}
	}
	
	// levelorder 
	public static void bfs(int root, ArrayList<ArrayList<Integer>> tree) {
		Queue<Integer> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int front = q.remove();
			System.out.println(front);
			for(int i=0; i<tree.get(front).size(); i++) {
				if(par[front] != tree.get(front).get(i))
					q.add(tree.get(front).get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = new TreeNode<>(0);
		
		for(int i=1; i<=5;  i++)
			root.children.add(new TreeNode<>(i));
		root.children.get(2).children.add(new TreeNode<Integer>(6));
		
		System.out.println(height(root));
		
		
		// tree using adj list
		int n = 9;
		int [][] edges = {{1, 0},{0, 2},{1, 3},{1, 5},{3, 4},{6, 7},{6, 2},{1, 8}};
		
		ArrayList<ArrayList<Integer> > tree = new ArrayList<>();
		for(int i=0; i<n; i++) {
			tree.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edges.length; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			tree.get(u).add(v);
			tree.get(v).add(u);			
		}
		
		System.out.println(height(5, -1, tree));
		
		System.out.println("size");
		dfs(0, -1, tree);
		for(int i=0; i<9; i++) {
			System.out.print(sz[i] + " ");
		}
		System.out.println("parent");
		for(int i=0; i<9; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.println();
		
		bfs(0, tree);
	}
}









