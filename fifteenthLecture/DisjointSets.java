package fifteenthLecture;

public class DisjointSets {

	public static int [] sets;
	
	public static int find(int node) {
		if(node == sets[node])
			return node;		
		return sets[node] = find(sets[node]);
	}
	
	public static void union(int u, int v) {
		int su = find(u);
		int sv = find(v);
		if(su != sv) {
			sets[su] = sets[sv];
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		sets = new int [n];
		
		// make set
		for(int i=0; i<n; i++) {
			sets[i] = i;
		}
		int [][] edges = {{1, 0},{0, 2},{1, 3},{1, 5},{3, 4},{6, 7},{6, 2},{1, 8}};
		
		for(int i=0; i<edges.length; i++) {
			union(edges[i][0], edges[i][1]);
			for(int j=0; j<n; j++) {
				System.out.print(sets[j] + " ");
			}
			System.out.println();
		}
	}

}
