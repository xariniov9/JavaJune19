package seventhLecture;

public class Class1 {

	public static void sort01(int [] arr) {
		int i=0, j=arr.length-1;
		while(i < j) {
			if(arr[i] == 0)
				i++;
			else if(arr[j] == 1)
				j--;
			else {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				
				i++;
				j--;
			}
		}
	}
	
	public static int binarySearch(int [] arr, int k, int lb, int ub) {
		if(ub < lb) {
			return -1;
		}
		int mid = (lb + ub)/2;
		if(arr[mid] == k)
			return mid;
		else if(k > arr[mid]) {
			return binarySearch(arr, k, mid+1, ub);
		}
		else
			return binarySearch(arr, k, lb, mid-1);
		
	}
	public static void merge(int [] arr, int l, int m, int u) {
		int [] la = new int[m-l+1];
		int [] ra = new int[u-m];
		
		for(int i=0; i<la.length; i++)
			la[i] = arr[i+l];
		for(int i=0; i<ra.length; i++)
			ra[i] = arr[i+m+1];
		
		int i=0, j=0, k=l;
		
		while(i<la.length && j<ra.length) {
			if(la[i] <= ra[j]) {
				arr[k] = la[i];
				k++;
				i++;
			} else {
				arr[k] = ra[j];
				j++;
				k++;
			}
		}
		
		while(i<la.length) {
			arr[k] = la[i];
			k++;
			i++;
		}
		while(j<ra.length) {
			arr[k] = ra[j];
			k++;
			j++;
		}
	}
	
	public static void merge1(int [] arr, int l, int m, int u) {
		int [] la = new int[m-l+1];
		int [] ra = new int[u-m];
		
		for(int i=0; i<la.length; i++)
			la[i] = arr[i+l];
		for(int i=0; i<ra.length; i++)
			ra[i] = arr[i+m+1];
		
		int i=0, j=0, k=l;
		
		while(k <= u) {
			if(i < la.length) {
				if(j < ra.length && ra[j] <= la[i]) {
					arr[k] = ra[j];
					j++;
					k++;
				} else {
					arr[k] = la[i];
					i++;
					k++;
				}
			} else {
				arr[k] = ra[j];
				j++;
				k++;
			}
		}
	}
	

	public static void mergeSort(int [] arr, int lb, int ub){
		if(ub <= lb)
			return;		
		int mid = (lb + ub)/2;
		mergeSort(arr, lb, mid);
		mergeSort(arr, mid+1, ub);
		merge(arr, lb, mid, ub);
	}
	
	// TODO : Quick Sort
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {0, 1, 1, 0, 0, 1, 0};
//		sort01(arr);
//		for(int i=0; i<arr.length; i++)
//			System.out.print(arr[i] + " ");
//		System.out.println();
		
		//int [] arr = {5, 4, 1, 8, 3, 5, 8, 9};
		int [] arr = {1, 3, 4, 5, 5, 8, 8, 9};
		mergeSort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.println(binarySearch(arr, 8, 0, arr.length-1));
		
		
		int [][] twoDArray = new int[10][10];
		
		for(int i=0; i<twoDArray.length; i++) {
			twoDArray[i] = new int[i+1];
			for(int j=0; j<twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}	
				
		int [][] twoDArray1 = new int[10][2];
		
		int [] a = new int[10];
		a[2] = 5;
		
		for(int i=0; i<twoDArray1.length; i++) {
			twoDArray1[i] = a;
			for(int j=0; j<twoDArray1[i].length; j++) {
				System.out.print(twoDArray1[i][j] + " ");
			}
			System.out.println();
		}
	}

}















