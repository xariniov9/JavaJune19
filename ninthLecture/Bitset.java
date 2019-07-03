package ninthLecture;

public class Bitset {
	
	public static int [] bitset = new int[100000];
	
	public static void add(int n) {
		int index = n/32;
		int offset = n%32;
		bitset[index] = bitset[index] | (1<<offset);
	}
	
	public static boolean check(int n) {
		int index = n/32;
		int offset = n%32;
		
		return (bitset[index] & (1<<offset)) != 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1);
		add(3);
		add(8);
		System.out.println(check(2));
		add(2);
		add(763);
		System.out.println(check(3));
		System.out.println(check(2));
		System.out.println(check(2));
		System.out.println(check(742));
		System.out.println(check(763));
	}
}
