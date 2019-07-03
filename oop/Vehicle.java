package oop;

public class Vehicle {
	int tyres;
	int seats;
	String color;
	
	public Vehicle(int t, int seats, String color) {
		tyres = t;
		this.seats = seats;
		this.color = color;
	}
	
	public Vehicle() {
		
	}
	
	public void printMessage() {
		System.out.println("Hi from Vehicle");
	}
}
