
class Car {
    public void accelerate(float speed) {
        System.out.println("Accelerating to " + speed);
    }
 }

class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(50.4F);
    }
}
