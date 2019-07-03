package eighthLecture;

//prefix sums

public class Class2 {

	public static void prefixSum(int [] arr, int [][] queries) {
		int [] prefixS = new int[arr.length];
		
		prefixS[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			prefixS[i] = prefixS[i-1] + arr[i];
		}
		
		for(int i=0; i<queries.length; i++) {
			int l = queries[i][0];
			int r = queries[i][1];
			
			int ans = prefixS[r] - ((l==0) ? 0 : prefixS[l-1]);
			
			System.out.println(ans);
		}
	}
	
	public static int getPrefixSum(int i, int j, int [][] mat, int [][] psDP) {
		if(i < 0 || j < 0 || i>=mat.length || j >= mat[0].length) {
			return 0;
		}
		if(psDP[i][j] != -1)
			return psDP[i][j];
		return psDP[i][j] = getPrefixSum(i-1, j, mat, psDP)
				+ getPrefixSum(i, j-1, mat, psDP)
				- getPrefixSum(i-1, j-1, mat, psDP)
				+ mat[i][j];
	}
	
	public static int getSum(int i1, int j1, int i2, int j2, int [][] mat, int [][] dp) {
		return getPrefixSum(i2, j2, mat, dp) 
				- getPrefixSum(i2, j1-1, mat, dp)
				- getPrefixSum(i1-1, j2, mat, dp)
				+ getPrefixSum(i1-1, j1-1, mat, dp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 4, 3, 5, 6, 9};
		int [][] queries = { {1, 1}, {2, 4}, {2, 5}, {3, 4}, {0, 3}};
		prefixSum(arr, queries);
	}
}









