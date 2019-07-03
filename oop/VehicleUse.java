package oop;

public class VehicleUse {

	public static void main(String[] args) {
		Car santro = new Car(1000, 4, 5, "red");
		System.out.println(santro.color);
		
		Vehicle x = santro;
		
		santro.printMessage();
		x.printMessage();
		
		Bicycle b = new Bicycle(4, 2, 2, "neon");
	}
}
