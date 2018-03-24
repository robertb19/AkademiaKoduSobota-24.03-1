public class Car {
	
	private String brand;
	private int engineCapacity;
	private int power;
	private int rentPrice;
	private String color;
	private String model;
	private double fuelConsumption;
	private String registrationPlate;

	public Car(String brand, int engineCapacity, int power, String color,
			String model, double fuelConsumption, String registrationPlate) {
		this.brand = brand;
		this.engineCapacity = engineCapacity;
		this.power = power;
		this.color = color;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.registrationPlate = registrationPlate;
		CarRepository.carList.add(this);
	}
	
	public Car(CarDataWrapper carDataWrapper) {
		this.brand = carDataWrapper.brand;
		this.engineCapacity = carDataWrapper.engineCapacity;
		this.power = carDataWrapper.power;
		this.color = carDataWrapper.color;
		this.model = carDataWrapper.model;
		this.fuelConsumption = carDataWrapper.fuelConsumption;
		this.registrationPlate = carDataWrapper.registrationPlate;
		CarRepository.carList.add(this);
	}


	public int getEngineCapacity() {
		return engineCapacity;
	}


	public int getPower() {
		return power;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}

	public String getBrand() {
		return brand;
	}


	@Override
	public String toString() {
		return " brand=" + brand + ", engineCapacity=" + engineCapacity
				+ ", power=" + power + ", rentPrice=" + rentPrice + ", color=" + color + ", model=" + model
				+ ", fuelConsumption=" + fuelConsumption + ", registrationPlate=" + registrationPlate;
	}
	
	

}
