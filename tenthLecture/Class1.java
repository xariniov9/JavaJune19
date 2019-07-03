package tenthLecture;

public class Class1 {

	public static void printSubsets(int [] arr, int idx, int mask) {
		if(idx == arr.length) {
			for(int i=0; i<arr.length; i++) {
				if((mask & (1<<i)) != 0) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		
		printSubsets(arr, idx+1, mask);
		printSubsets(arr, idx+1, mask  | (1<<idx));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 5, 3};
		printSubsets(arr, 0, 0);
	}

}
