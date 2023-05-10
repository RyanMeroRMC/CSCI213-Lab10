


public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	public Car(String theMake, String theModel, String thePlate, int theDoors, int thePassengers) {
		super(theMake, theModel, thePlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors() {
		int doors = this.doors;
		return doors;
	}
	
	public int getPassengers() {
		int passengers = this.passengers;
		return passengers;
	}
	
	@Override
	public String toString() {
		String strCar = "";
		String make = this.getMake();
		String model = this.getModel();
		String plate = this.getPlate();
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		
		strCar = String.format("%d-door %s %s with license %s.", doors, make, model, plate);
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car) {
			return false;		
		}
		Car mycar = (Car) other;
		if(super.equals(myCar)) {
			if(this.doors == myCar.getDoors()) {
				if(this.passengers == myCar.getPassengers()) {
					return true;	
				}
			}
		}
		return false;
	}
	
	@Override
	public Car copy() {
		Car theCopy = new Car(super.make, super.model, super.plate, this.doors, this.passengers);
		return theCopy;
	}

}