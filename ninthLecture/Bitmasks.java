package ninthLecture;

public class Bitmasks {

	public static void printPermutation(String str, String runningAns, int mask) {
		if( mask == (1<<str.length()) - 1 ) {
			System.out.println(runningAns);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			if((mask & (1<<i)) == 0) {
				printPermutation(str, runningAns + str.charAt(i), mask | (1<<i));
			}
		}
	}
	
	// no two included integers should have common digit
	public static boolean subsetSum(int idx, int sum, int mask, int [] arr) {
		if(idx == arr.length) {
			return sum == 0;
		}
		
		int newMask = 0;
		int n = arr[idx];
		while(n > 0) {
			newMask = newMask | (1 << (n % 10));
			n/=10;
		}
		if((newMask & mask) == 0) {
			// arr[idx] can be included
			return subsetSum(idx+1, sum - arr[idx], newMask | mask, arr)
					|| subsetSum(idx+1, sum, mask, arr);
		}
		return subsetSum(idx+1, sum, mask, arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutation("abc", "", 0);
		int [] arr = {1, 32, 8, 822, 829};
		System.out.println(subsetSum(0, 830, 0, arr));
		
	}
}













