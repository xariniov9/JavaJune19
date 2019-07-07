package twelthLecture;

public class Square implements Shape, Comparable<Square>{

	int side;
	public Square(int s) {
		side = s;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}
	

	@Override
	public int compareTo(Square s) {
		// TODO Auto-generated method stub
		return getArea() - s.getArea();	
	}
}
