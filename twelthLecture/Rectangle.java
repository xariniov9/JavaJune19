package twelthLecture;

public class Rectangle implements Shape{

	int l, b;
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return l * b;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}
	
}
