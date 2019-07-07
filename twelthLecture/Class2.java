package twelthLecture;

import eleventhLecture.LinkedList;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5);
		System.out.println(s.getArea());
		
		Square s1 = new Square(6);
		
		System.out.println(s1.compareTo(s));
		
		Rectangle r = new Rectangle(2, 5);
		System.out.println(r.getPerimeter());
		
		Integer x = 5;
		System.out.println(x.compareTo(7));
		
		String str = "axyz";
		System.out.println(str.compareTo("abc"));
		
		LinkedList<Square> lList = new LinkedList<>();
	}

}
