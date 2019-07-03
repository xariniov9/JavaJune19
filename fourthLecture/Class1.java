package fourthLecture;

// RECURSION

public class Class1 {
	
	public static int first42(int [] arr) {
		// return index of first 42 in array, -1 if not present
		if(arr.length == 0)
			return -1;
		
		if(arr[0] == 42)
			return 0;
		
		int [] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		int smallIdx = first42(smallArr);
		if(smallIdx == -1)
			return -1;
		return smallIdx+1;
	}
	
	public static int last42(int [] arr) {
		// return index of last 42 in array, -1 if not present
		if(arr.length == 0)
			return -1;
		
		int [] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		int lastIdx = last42(smallArr);
		if(lastIdx >= 0) {
			return lastIdx + 1;
		}
		if(arr[0] == 42)
			return 0;
		return -1;
	}
	
	public static String changePi(String str) {
		// change all occurences of 'pi' with '3.14' in str
		// you can use .charAt and .substring()
		// xyabcPiPidP
		if(str.length() <= 1)
			return str;
		if(str.substring(0, 2).equals("Pi"))
			return "3.14" + changePi(str.substring(2));
		return str.charAt(0) + changePi(str.substring(1));
	}
	
	public static String pairStar(String str) {
		if(str.length() <= 1)
			return str;
		if(str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		return str.charAt(0) + pairStar(str.substring(1));
	}
	
	public static int nthFactorial(int n) {
		if(n==0)
			return 1;
		return n * nthFactorial(n-1);
	}
	
	public static int nthFibonacci(int n) {
		if(n<=1)
			return 1;
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
	
	public static boolean subsetSum(int [] arr, int idx, int sum) {	
		if(arr.length == idx) {
			return sum == 0;
		}
		
		return subsetSum(arr, idx+1, sum) || 
				subsetSum(arr, idx+1, sum - arr[idx]);		
	}
	
	// arr = {1, 2, 3, 4, 5}
	public static boolean isSorted(int [] arr) {
		if(arr.length <= 1)
			return true;
		
		int [] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		boolean smallAns = isSorted(smallArr);
		
		if(smallAns == true) {
			return arr[0] <= arr[1] ? true : false;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {1, 2, 7, 4, 6};
//		System.out.println(isSorted(arr));
		System.out.println(changePi("xyabcPiPidP"));
		int [] arr = {5, 6, 2, 3};
		System.out.println(subsetSum(arr, 0, 14));
	}
}
