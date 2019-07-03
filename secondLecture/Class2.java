package secondLecture;

public class Class2 {

	public static boolean isPrime(int n) {
		for(int i=2; i*i<=n; i++) {
			int x = 5;
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSorted(int [] arr) {
		// return true if arr is sorted, false otherwise!
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}

	public static int first42(int [] arr) {
		// return the index of first 42 in arr. -1 if not present
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 42)
				return i;
		}
		return -1;
	}

	public static int last42(int [] arr) {
		// return the index of last 42 in arr. -1 if not present
		//		for(int i = arr.length-1; i>=0; i--) {
		//			if(arr[i] == 42)
		//				return i;
		//		}
		//		return -1;
		int idx = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 42)
				idx = i;
		}
		return idx;
	}

	public static int countX(String str) {
		// return number of 'X' in str
		int count  = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'X')
				count++;
		}
		return count;
	}

	public static String changePi(String str) {
		// return modified str such that all occurances of "pi"
		// are replaced with "3.14"
		//		String s = "kjfds";
		//		String a = "3.14";
		//		s = s+a;

		String ans = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'P' && i+1 < str.length() && str.charAt(i+1) == 'i') {
				ans += "3.14";
				i++;
			} else {
				ans += str.charAt(i);
			}
		}
		return ans;
	}
	public static String pairStar(String str) {
		// insert '*' between identical characters in str
		// pairStar("aaabcxxz") => "a*a*abcx*xz"

		String ans = "";
		for(int i=0; i<str.length(); i++) {
			ans = ans + str.charAt(i);
			if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
				ans = ans + "*";
		}
		return ans;
	}

	public static String strDist(String s1, String s2) {
		// return the largest substring of s1 that starts and ends
		// with s2
		// you can use str.substring() method
		int start = -1, end=-1;
		start = s1.indexOf(s2);
		end = s1.lastIndexOf(s2);

		if(end == -1) {
			return "";
		}
		return s1.substring(start, end+s2.length());

		// TODO try to not use indexOf and lastIndexOf
	}

	public static void SelectionSort(int [] arr) {
		// LV : Array till index i contains i - smallest elements of array
		// To maintain find smallest elemnt in [i, length] and replace with i'th element

		for(int i=0; i<arr.length; i++) {
			int smallestElement = arr[i];
			int pos = i;
			for(int j=i; j<arr.length; j++) {
				if(smallestElement > arr[j]) {
					smallestElement = arr[j];
					pos = j;
				}
			}
			int tmp = arr[i];
			arr[i] = smallestElement;
			arr[pos] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = isPrime(13);
		System.out.println(a);

		String str = "xyabcPiPidP";
		String modified = changePi(str);
		System.out.println(modified);

		str = "aaabcxxz";
		System.out.println(pairStar(str));

		int [] arr = {3, 5, 2, 1, 6};
		SelectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}











