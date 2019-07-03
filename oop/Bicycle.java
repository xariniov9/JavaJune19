package oop;

public class Bicycle extends Vehicle {
	int gears;
	public Bicycle(int g, int t, int seats, String color) {
		super(t, seats, color);
		gears = g;
	}
}
