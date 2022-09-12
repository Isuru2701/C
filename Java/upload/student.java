
import java.util.Scanner;

class Student {
	private String Studentname;
	private int age;

	public Student(String Studentname, int age) {
		this.Studentname = Studentname;
		this.age = age;
	}
	
	public void Display() {
		System.out.println("Name: " + Studentname + " Age: " + age);
	}
}

class Main {

	public static void main(String[] args) {
		String name;
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.next();

		System.out.println("Enter age: ");
		age = sc.nextInt();

		Student student = new Student(name, age);
		student.Display();
		

	}
	
}