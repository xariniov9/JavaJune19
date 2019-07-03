package sixthlecture;

public class Class1 {

	public static int [][] dp = new int[10][10];
	public static int knapsack(int idx, int [] w, int [] v, int W) {
		if(idx == w.length) {
			return 0;
		}
		if(dp[idx][W] != 0)
			return dp[idx][W];
		int smallAns1 = knapsack(idx+1, w, v, W);
		int smallAns2 = 0;
		if(w[idx] <= W) {
			smallAns2 = v[idx] + knapsack(idx+1, w, v, W-w[idx]);
		}
		return dp[idx][W] = Math.max(smallAns1, smallAns2);
	}
	
	public static int [] f = new int [60];
	public static int fib(int n) {
		if(n<=1)
			return 1;
		if(f[n] != 0) 
			return f[n];
		return f[n] = fib(n-1) + fib(n-2);		
	}
	
	// init with -1
	public static int [][]lcsDp = new int[50][50];
	public static int lcs(String s1, String s2, int idx1, int idx2) {
		if(s1.length() == idx1 || s2.length() == idx2)
			return 0;
		
		if(lcsDp[idx1][idx2] != -1)
			return lcsDp[idx1][idx2];
		
		int ans = 0;
		if(s1.charAt(idx1) == s2.charAt(idx2))
			ans  = 1 + lcs(s1, s2, idx1+1, idx2+1);
		else {
			ans = Math.max(lcs(s1, s2, idx1+1, idx2),
				lcs(s1, s2, idx1, idx2+1));
		}
		return lcsDp[idx1][idx2] = ans;
	}
	
	public static int [] dpLis = new int[20];
	// returns max length of lis including arr[idx]
	public static int lis(int [] arr, int idx) {
		if(arr.length == idx) {
			return 0;
		}
		if(dpLis[idx] != 0)
			return dpLis[idx];
		int ans = 1;
		for(int i = idx+1; i<arr.length; i++)
			if(arr[i] >= arr[idx])
				ans = Math.max(ans, 1+lis(arr, i));
		return dpLis[idx] = ans;
	}
	
	public static int lis(int [] arr) {
		int lisAns = 0;
		for(int i=0; i<arr.length; i++) {
			lisAns = Math.max(lisAns, lis(arr, i));
		}
		return lisAns;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fib(55));
//		int [] w = {5, 4, 3, 2, 1};
//		int [] v = {3, 2, 3, 5, 1};
//		int W = 5;
//		System.out.println(knapsack(0, w, v, W));
		
//		String s1 = "abcdef";
//		String s2 = "bxaecd";
//		for(int i=0; i<s1.length(); i++)
//			for(int j=0; j<s2.length(); j++)
//				lcsDp[i][j] = -1;
//		System.out.println(lcs(s1, s2, 0, 0));
		
		int [] arr = {20, 4, 8, 6, 3, 4, 9, 6, 7};
		System.out.println(lis(arr));
		
	}
}
