package eighthLecture;

public class Class1 {

	public static boolean isPossible(String str) {
		// check if palindrome can be made using all chars of str

		//calculate frequency of each character
		int [] freq = new int[26];
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}

		int oddFreq = 0;
		for(int i=0; i<26; i++) {
			if(freq[i] % 2 == 1)
				oddFreq++;
		}

		if(str.length() % 2 == 1) {
			return oddFreq == 1 ? true : false;
		}
		return oddFreq == 0 ? true : false;
	}

	public static int [] seive(int n) {
		int [] isPrime = new int[n+1];
		// convention :
		// if isPrime[i] == 0 : prime
		// else non prime

		for(int i=2; i<=n; i++) {
			if(isPrime[i] == 0) {
				for(int j=2; i*j<=n; j++) {
					isPrime[i * j] = 1;	// mark all multiples of i as composite
				}
			}
		}
		return isPrime;
	}

	public static int [] seiveModified(int n) {
		int [] lpFact = new int[n+1];
		// convention :
		// if lpFact[i] == i : prime
		// else non prime

		for(int i=2; i<=n; i++) {
			if(lpFact[i] == 0) {
				for(int j=1; i*j<=n; j++) {
					if(lpFact[i*j] == 0)
						lpFact[i * j] = i;	
				}
			}
		}
		return lpFact;
	}
	
	public static void printPrimeFactorization(int N, int [] lpFact) {
		if(N == lpFact[N]) { //isprime
			System.out.println(N);
			return;
		}
		System.out.print(lpFact[N] + " x ");
		printPrimeFactorization(N/lpFact[N], lpFact);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 50;
		
		System.out.println("Prime Numbers:");
		int [] isPrime = seive(N);
		for(int i=2; i<=N; i++) {
			if(isPrime[i] == 0)
				System.out.println(i);
		}
		
		int [] lp = seiveModified(N);
		System.out.println("lowest prime factors");
		for(int i=2; i<=N; i++) {
			System.out.print(i +" : "+ lp[i]);
			if(lp[i] == i) {
				System.out.print(" (prime)");
			}
			System.out.println();
		}
		lp[1] = 1;
		lp[0] = 0;
		
		// print prime factorization of all numbers less than N
		for(int i=2; i<=N; i++) {
			printPrimeFactorization(i, lp);
		}
	}
}















