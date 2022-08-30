class Employee {
	float basicSalary = 500000;

	public void displayInfo() {
		System.out.println("My salary is " + basicSalary);
	}

}

class Manager extends Employee {
	float allowance = 2000;
	public void displayInfo() {
		float totalSalary = basicSalary + allowance;
		System.out.println("My salary is " + totalSalary);
	}
}

class Experiment2 {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.displayInfo();
	}
}