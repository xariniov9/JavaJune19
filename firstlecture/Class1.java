package firstlecture;

import java.util.Scanner;

public class Class1 {

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int solve(String s, int present) {
		int proxy = 0;
		int d = s.length();
		for(int i=2; i<s.length()-2; i++) {
			if(s.charAt(i) == 'A' && (s.charAt(i-1) == 'P' || s.charAt(i-2) == 'P') &&
					(s.charAt(i+1) == 'P' || s.charAt(i+2) == 'P' )) {
				proxy++;
				if( (double)(present + proxy)/d >= 0.75) {
					break;
				}
			}
		}
		return proxy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DATA TYPES
		int a = 12;
		float b = (float)1.1;
		double c = 12.1111;
		char d = 'a';
		long e = 711462873;
		
		a = (int)e;
		e = a;
		
		String f = "himanshu hello!";
		
		// operators
		// arithmetic
		// + - * / % 
		
		// Relational
		// > < != == <= >=
		
		// Bitwise
		// & | ^ ~ >> <<
		
		// && || 
		
		// Ternary operator
		// ? :
		
		int x=1, y=2, z=3, p=4;
		int max = x;
		
		if(x>y && x>z) {
			max = x;
		}
		else if(y>x && y>z) {
			max = y;
		} else {
			max = z;
		}
		
		max = (x > y) ? ((x>z) ? x : z ): (y>z ? y : z);
		max = Max(Max(x, y), Max(p,z));
		
		//String a = "abcd";
		
		//System.out.println("abc");
		
		Scanner sc = new Scanner(System.in);
		//1900 2000
		int year = 1900;
		
		//2016
		if(year%4 == 0) {
			if(year % 100 ==0) {
				if(year%400 == 0) {
					//leap
				}
				else {
					// not leap 
				}
			}
			else {
				//leap
			}
		}
		else {
			// not leap
		}
		
		
		// galt
		if((year%100 == 0 && year%400 == 0) ||  year %4 == 0) {
			//leap
		} else {
			// not leap
		}
		
		if((year%100 == 0 && year%400 == 0) ||  
				(year %4 == 0 && year%100 != 0) ) {
			//leap
		} else {
			// not leap
		}
		
		char ch = 'a';
		
		if(ch>='a' && ch <= 'z') {
			// lowercase
		} 
		if(ch>='A' && ch <= 'Z') {
			// uppercase
		} 
		
		// 2000, 500, 100, 50
		
		int money = 12345;
		int k2 = money/2000;
		money = money%2000;
		int p5k = money/5;
		money = money%500;
		// ... and so on...
		
		
		
		
		sc.close();
		/*int xx = sc.nextInt();
		long yy = sc.nextLong();*/
		String zz = "abc";
		int n = 3;
		for(int i=0; i<(1<<n); i++) {
			for(int j=0; j<n; j++) {
				if((i & (1<<j)) != 0) {
					System.out.print(zz.charAt(j));
				}
			}
			System.out.println();
		}
//		sc.close();
		
//		for(int i=0; i<100; i++) {
//			if(i % 15 == 0) {
//				System.out.println("fizzbuzz");
//			}
//			else if(i % 5 == 0) {
//				System.out.println("buzz");
//			}
//			else if(i%3 == 0) {
//				System.out.println("fizz");
//			}
//		}
//		
		for(int i=0; i<100; i++) {
			if(i%3 == 0) {
				System.out.print("fizz");
			}
			if(i % 5 == 0) {
				System.out.print("buzz");
			}
			System.out.println();
		}	
		
		//1900 2000
		
		
	}
}






















