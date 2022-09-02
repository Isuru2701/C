import java.util.Scanner;

class Increments{
	

	public static void main(String[] args) {

	char type;
	float salary, increment = 0;	
	Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 10; ++i) {
			System.out.println("enter employee type: ");
			type = sc.next().charAt(0);
			System.out.println("enter employee salary: ");
			salary = sc.nextFloat();
			
			switch(type) {
				
				case 'A':
					increment += salary * 0.03;
					break;

				case 'B':
					increment += salary * 0.05;
					break;

				case 'C':
					increment += salary * 0.06;
					break;
			}

		}
	System.out.println("total increments given: " + increment);
	
	}
}