class Employee {
	protected int age;
	protected float basicSalary;
}

class Lecturer extends Employee {
	private float epf;
	private float etf;
	private float newSalary;

	public Lecturer(float salary, int age) {
		super.basicSalary = salary;
		super.age = age;

	}

	public void calSalary() {
		epf = (float)(basicSalary * 0.08);
		etf = (float)(basicSalary * 0.03);
		newSalary = basicSalary - (epf + etf);


	}

	public void printSalary() {
		System.out.println("Age is: " + age + "\n" + epf + "\n" + etf + "\n" + basicSalary + "\n" + newSalary); 
	}
}

public class EmployeeApp {
	public static void main(String[] args) {
		Lecturer obj = new Lecturer(2000F, 60);
		obj.calSalary();
		obj.printSalary();
	}
}