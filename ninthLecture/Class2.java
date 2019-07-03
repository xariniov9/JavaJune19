package ninthLecture;

public class Class2 {

	// Biwise operators
	// & - bitwise and
	// | - bitwise OR
	// >> - right shift
	// << - left shift
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		if((n & 1) == 1) {
			// odd
		} else {
			// even
		}
		
		int x = (1<<n); // 5th power of 2 ( 100000 )
		
		int y = 2145324;
		if((y & (1<<5)) != 0) {
			// if n'th bit of y is 1
		} else {
			
		}
		
		if(y == (1<<5) - 1) {
			// check if n LSB are 1
		} else {
			
		}
		
	}

}












