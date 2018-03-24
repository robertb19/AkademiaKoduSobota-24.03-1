import java.util.InputMismatchException;
import java.util.Scanner;

public class CarDataWrapper {
	
	public String brand;
	public int engineCapacity;
	public int power;
	public int rentPrice;
	public String color;
	public String model;
	public double fuelConsumption;
	public String registrationPlate;

	public static CarDataWrapper readMainParameters() {
	Scanner in = new Scanner(System.in);
	CarDataWrapper carDataWrapper = new CarDataWrapper();
	System.out.println("Brand: ");
	carDataWrapper.brand = in.nextLine();
	System.out.println("Engine capacity: ");
	carDataWrapper.engineCapacity = in.nextInt();

	carDataWrapper.power = ourScanner("Power: ");
	System.out.println("Color: ");
	carDataWrapper.color = in.nextLine();
	System.out.println("Model ");
	carDataWrapper.model = in.nextLine();
	System.out.println("Fuel Consumption ");
	carDataWrapper.fuelConsumption = in.nextDouble();
	System.out.println("Registration Plate: ");
	carDataWrapper.registrationPlate = in.nextLine();
	carDataWrapper.rentPrice = ourScanner("Rent Price: ");
	return carDataWrapper;
	}
	
	public static int ourScanner(String parameterName) {
	int result;
	while(true) {
		try {
		Scanner in = new Scanner(System.in);
		System.out.println(parameterName + " ");
		result = in.nextInt();
		}	
		catch(InputMismatchException de) {
		System.out.println("Zepsulo sie! ");
		continue;
		}
		break;
				}
	return result;
	}
	
	
	
	
	
}
