
public class FamilyCar extends Car {

	private int seatNumbers;
	
	public FamilyCar(String brand, int engineCapacity, int power, String color,
			String model, double fuelConsumption, String registrationPlate, int seatNumbers) {
		
		super(brand, engineCapacity ,power, color, model, fuelConsumption, registrationPlate);
		this.seatNumbers = seatNumbers;
	}
	
	public FamilyCar(CarDataWrapper carDataWrapper, int seatNumbers) {
	super(carDataWrapper);
	this.seatNumbers = seatNumbers;
	}

	@Override
	public String toString() {
		return "FamilyCar [seatNumbers=" + seatNumbers + super.toString() + "]";
	}

	
	
}
