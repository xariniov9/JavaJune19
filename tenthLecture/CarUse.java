package tenthLecture;

public class CarUse {

	public static void main(String[] args) {
		
		Car alto = new Car();
		//alto.color = "black";
		alto.numTyres = 4;
		alto.printSpecifications();
		
		Car santro = new Car();
		//santro.color = "red";
		santro.seats = 4;
		santro.printSpecifications();
		
		Car wagonR = new Car("red", 4, 5, 1000);
		wagonR.printSpecifications();
	}

}
