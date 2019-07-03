package secondLecture;

import java.util.Scanner;

public class Class1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
//		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println("Entered int is " + x);
		
//		String s = sc.next();
//		System.out.println("Entered string is " + s);
		
		// arrays
		int [] Arr2 = {1, 2, 3, 4};
		
		for(int i=0; i<Arr2.length; i++) {
			System.out.print(Arr2[i] + " ");
		}
		System.out.println();
		
		// input array of size x
		int size = sc.nextInt();
		int [] Arr = new int[size];
		for(int i=0; i<size; i++) {
			Arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println(Arr[i]);
		}
		
		int y = sc.nextInt();
		System.out.println("y : " + y);
		
	}
}












