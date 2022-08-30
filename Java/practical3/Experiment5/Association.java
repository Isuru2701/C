class Bank { 

	private String name;


	//bank name
	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

class Employee {
	private String name;

	//employee name
	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName(){
		return this.name;
	}

}

//Association between both the classes in the main method

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Neha");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}
