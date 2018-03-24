public class Offroad extends Car {

private boolean reduktor, x4drive, spareWheel;
	
public Offroad(String brand, int engineCapacity, int power, int rentPrice, String color,
		String model, double fuelConsumption, String registrationPlate, boolean reduktor, boolean x4drive, boolean spareWheel) {
	
	super(brand, engineCapacity ,power, color, model, fuelConsumption, registrationPlate);
	this.reduktor = reduktor;
	this.x4drive = x4drive;
	this.spareWheel = spareWheel;
}

public boolean isReduktor() {
	return reduktor;
}

public boolean isX4drive() {
	return x4drive;
}

public boolean isSpareWheel() {
	return spareWheel;
}

@Override
public String toString() {
	return "Offroad [reduktor=" + reduktor + ", x4drive=" + x4drive + ", spareWheel=" + spareWheel + 
			 super.toString() + "]";
}
	
	
	
}
