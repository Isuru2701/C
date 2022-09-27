class Car {
	private String color, brandName;
	private float maxSpeed, numberOfSeats;

	public void drive() {
		System,out.println("Car is now driving");
	}
	public void brake() {
		System,out.println("Car is now braking");
	}

}

class CarMain {
	public static void main(String[] main) {
		Car myCar = new Car();
		myCar.drive();
		myCar.brake();
	}
}
