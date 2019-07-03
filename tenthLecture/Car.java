package tenthLecture;

public class Car {
	static int numTyres = 4;
	private String color;
	int seats;
	int engineCapacity;
	
	//default constructor
	public Car() {
		System.out.println("default contructor called");
		numTyres = 4;
	}
	
	// defined constructor
	public Car(String color, int numtyres, int seats, int ec) {
		this.color = color;
		this.numTyres  = numtyres;
		this.seats = seats;
		engineCapacity = ec;
	}
	
	public void startCar() {
		System.out.println("Car started");
	}
	
	public void printSpecifications() {
		System.out.println("numTyres : " + numTyres);
		System.out.println("color : " + color);
		System.out.println("seats : " + seats);
	}
}
