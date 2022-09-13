class Driver {
    private int nic;
    private String name;
    Vehicle vehicle;

    public Driver(int nic, String name, String model, int number) {
        this.nic = nic;
        this.name = name;
        vehicle = new Vehicle(model, number);
    }

    public void showDetails() {
        System.out.println("Driver details:\n NIC: " + nic + "\tName: " + name + "\nVehicle details:\n Model: " + vehicle.getModel() + "\tNumber: " + vehicle.getNumber());
    }
}

class Vehicle {
    private String model;
    private int number;

    public Vehicle(String model, int number) {
        this.model = model;
        this.number = number;

    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public void showDetails() {
        System.out.println("Vehicle model: " + model + "\tNumber: " + number);
    }
}

class DriverMain {
    public static void main(String[] args) {

        Driver driver = new Driver(500103, "Joe", "Ford", 0242);
        driver.showDetails();
    }


}