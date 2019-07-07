package twelthLecture;

public class Square implements Shape, Comparable{

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
	public int compareTo(Object s) {
		return getArea() - ((Square)s).getArea();
	}
}
