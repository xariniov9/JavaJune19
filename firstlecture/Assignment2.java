package firstlecture;

import java.util.Scanner;

public class Assignment2 {
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 74638;
//		int finalNum = 0;
//		while(n > 0) {
//			int rem = n%10;
//			finalNum = finalNum*10 + rem;
//			n /= 10;
//		}
//		System.out.println(finalNum);
		
		int oddSum=0, evenSum=0; boolean isOdd = true;
		while(n>0) {
			int rem = n % 10;
			if(isOdd) {
				oddSum += rem;
				isOdd = false;
			} else {
				evenSum += rem;
				isOdd = true;
			}
			n/=10;
		}
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		oddSum = 0;
		evenSum = 0;
		for(int i=num.length()-1; i>=0; i-=2) {
			oddSum += num.charAt(i) - '0';
		}
		
		sc.close();
//		for(int i=2; i<n; i++) {
//			if(isPrime(i)) {
//				//Prime
//			} 
//		}
		
//		int N = 20;
//		int [] fib = new int[N];
//		fib[0] = 0; fib[1] = 1;
//		
//		for(int i=2; i<20; i++) {
//			fib[i] = fib[i-1] + fib[i-2];
//		
//		}		
		
//		int f0 = 0, f1=1;
//		for(int i=0; i<20; i++) {
//			int f2 = f1 + f0;
//			System.out.println(f2);
//			f0 = f1;
//			f1 = f2;
//		}
		
		int N = 4, k=1;
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}











