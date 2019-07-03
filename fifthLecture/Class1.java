package fifthLecture;

public class Class1 {

	public static void printSubseq(String str, String runningAns) {
		if(str.length() == 0) {
			System.out.println(runningAns);
			return ;
		}
		printSubseq(str.substring(1), runningAns);
		printSubseq(str.substring(1), runningAns + str.charAt(0));
		
	}
	
	public static String [] subseq(String str) {
		if(str.length() == 0) {
			String [] output = new String[1];
			output[0] = "";
			return output;
		}

		String [] smallAns = subseq(str.substring(1));
		
		String [] output = new String[2 * smallAns.length];
		for(int i=0; i<smallAns.length; i++)
			output[i] = smallAns[i];
		for(int i=smallAns.length; i<output.length; i++) {
			output[i] = str.charAt(0) + smallAns[i-smallAns.length];
		}
		return output;
	}
	
	public static int fib(int n) {
		//System.out.println(n);
		// recursive fibonacci
		// O(n) space and O(2^n) time
		if(n<=1)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	public static int fibItr(int n) {
		// iterative fibonacci
		// O(n) time and space
		int [] f = new int[n+1];
		f[0] = f[1] = 1;
		for(int i=2; i<=n; i++)
			f[i] = f[i-1] + f[i-2];
		return f[n];		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
//		printSubseq(str, "");
//		
//		String [] subsequences = subseq(str);
//		for(int i=0; i<subsequences.length; i++)
//			System.out.println(subsequences[i]);
//		System.out.println(fibItr(45));
//		System.out.println(fib(45));
		
//		for(int i=0; i<n; i++)
//			for(int j=0; j<n; j++)
//				// some constanr amount of work
//				
//		for(int i=0; i<n; i++)
//			for(int j=i; j<n; j++)
//				// O(1) work
		
		int n = 10;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; i++) {
				j++;
				System.out.println(i);
			}
		}
		
		//for(int i=n; i>=0; i/=2)
			// some constant work

	}

}









