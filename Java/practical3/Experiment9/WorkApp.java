class Person {
	protected int age;
}

class Employee extends Person {
	protected String emp_id;
	protected float salary;
}

class Driver extends Employee {
	private final float hour_rate = 100;
	private int hours;
	private float newSalary;


	public Driver(String emp_no, int age, float salary, int hours){
		this.hours = hours;
		super.emp_id = emp_no;
		super.age = age;
		super.salary = salary;
	}

	public void calSalary() {
		newSalary = (hours * hour_rate) + salary;
		System.out.println(newSalary);
	}
}

public class WorkApp{

	public static void main(String[] args) {
		Driver obj = new Driver("E001",24, 3000F, 5); 
		obj.calSalary();
	}
}