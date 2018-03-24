public class Bus extends Car{

private int seatNumbers, standingPlaces;
private double lenght, height;

public Bus(String brand, int engineCapacity, int power, int rentPrice, String color,
		String model, double fuelConsumption, String registrationPlate, int seatNumbers, int standingPlaces, double height, double lenght) {
	
	super(brand, engineCapacity ,power, color, model, fuelConsumption, registrationPlate);
	this.seatNumbers = seatNumbers;
	this.standingPlaces = standingPlaces;
	this.lenght = lenght;
	this.height = height;
}

public Bus(CarDataWrapper c1, int seatNumbers, int standingPlaces, double lenght, double height) {
super(c1);
this.seatNumbers = seatNumbers;
this.standingPlaces = standingPlaces;
this.lenght = lenght;
this.height = height;
}


public int getSeatNumbers() {
	return seatNumbers;
}

public int getStandingPlaces() {
	return standingPlaces;
}

public double getLenght() {
	return lenght;
}

public double getHeight() {
	return height;
}

@Override
public String toString() {
	return "Bus [seatNumbers=" + seatNumbers + ", standingPlaces=" + standingPlaces + ", lenght=" + lenght + ", height="
			+ super.toString() + "]";
}
	
	
}
