package oop;

public class Car extends Vehicle{
	int engineCapacity;
	
	public Car(int ec, int t, int seats, String color) {
		super(t, seats, color);
		this.engineCapacity = ec;
		// 		super(t, seats, color); wrong!

	}
	
	public void printMessage() {
		System.out.println("Hi from Car");
	}
}
