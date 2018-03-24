
public class Truck extends Car {

private int maxCarWeight;
private double height;
private double width;
private int axisNumber;
private boolean trailer;

public Truck(String brand, int engineCapacity, int power, int rentPrice, String color,
		String model, double fuelConsumption, String registrationPlate, int maxCarWeight, double height, double width, int axisNumber, boolean trailer) {
	
	super(brand, engineCapacity ,power, color, model, fuelConsumption, registrationPlate);
	this.maxCarWeight = maxCarWeight;
	this.height = height;
	this.width = width;
	this.axisNumber = axisNumber;
	this.trailer = trailer;
}

public int getMaxCarWeight() {
	return maxCarWeight;
}

public double getHeight() {
	return height;
}

public double getWidth() {
	return width;
}

public int getAxisNumber() {
	return axisNumber;
}

public boolean isTrailer() {
	return trailer;
}

public void setAxisNumber(int axisNumber) {
	this.axisNumber = axisNumber;
}

public void setTrailer(boolean trailer) {
	this.trailer = trailer;
}

@Override
public String toString() {
	return "Truck [maxCarWeight=" + maxCarWeight + ", height=" + height + ", width=" + width + ", axisNumber="
			+ axisNumber + ", trailer=" + trailer + super.toString() + "]";
}


	
}
