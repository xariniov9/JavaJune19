package thirdLecture;

public class Class1 {
	
	public static boolean isPalindrome(String str) {
		// return true if str is palindrome, false otherwise!
		for(int i=0, j=str.length()-1; i<=j; i++, j--) {
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
	public static int [] merge(int [] a1, int [] a2) {
		// assume that a1 and a2 are already sorted, 
		// return another sorted array by merging a1 and a2.
		
		int [] a3 = new int[a1.length + a2.length];
		int i=0, j=0, k=0;
		
//		for(; i<a1.length && j<a2.length; ) {
//			if(a1[i] <= a2[j]) {
//				a3[k] = a1[i];
//				i++;
//				k++;
//			} else {
//				a3[k] = a2[j];
//				k++;
//				j++;
//			}
//		}
		
		while(i<a1.length && j<a2.length) {
			if(a1[i] <= a2[j]) {
				a3[k] = a1[i];
				i++;
				k++;
			} else {
				a3[k] = a2[j];
				k++;
				j++;
			}
		}
		while(i<a1.length) {
			a3[k] = a1[i];
			k++;
			i++;
		}
		while(j<a2.length) {
			a3[k] = a2[j];
			k++; j++;
		}
		return a3;
	}
	public static void insertionSort(int [] arr) {
		
		for(int i=1; i<arr.length; i++) {
			// assume arr[0.. i-1] is sorted!
			int ele = arr[i];
			int pos = i;
			for(int j=i-1; j>=0; j--) {
				if(ele < arr[j]) {
					arr[j+1] = arr[j];
					pos = j;
				}
				else
					break;
			}
			arr[pos] = ele;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "nitin";
//		System.out.println(isPalindrome(str));
//		
//		int [] arr = {5, 9, 7, 2, 7};
//		insertionSort(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println();
		
		int [] a1 = {1, 3, 4, 8, 9};
		int [] a2 = {4, 4, 5, 6, 8, 10};
		int [] a3 = merge(a1, a2);
		for(int i=0; i<a3.length; i++) {
			System.out.println(a3[i] + " ");
		}
		System.out.println();
		
		// pattern 1
		int N = 4;
		int k = 1;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print(i + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}












