package ninthLecture;

public class Class1 {

	public static void solve(int [] arr, int [][] queries) {
		/*
		 * for each query
		 * 	add queries[i][3] from index l to r in arr
		*/
		
		int [] helperArr = new int[arr.length + 1];
		
		for(int i=0; i<queries.length; i++) {
			int l = queries[i][0];
			int r = queries[i][1];
			int v = queries[i][2];
			helperArr[l] += v;
			helperArr[r+1] -= v;
		}
		
		for(int i=1; i<helperArr.length; i++)
			helperArr[i] = helperArr[i-1] + helperArr[i];
		
		for(int i=0; i<arr.length; i++)
			arr[i] += helperArr[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 0, 2, 3, 1, 0};
		int [][] queries = {{2, 5, 3}, {1, 3, 2}};
		
		solve(arr, queries);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
