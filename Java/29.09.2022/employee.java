import java.util.Scanner;

class Employee {
    private int empid, years;
    private String empName;
    private double salary, incentive = 0 ;

    public void inputDetails() {
        private Scanner sc  = new Scanner(System.in);

        System.out.println("enter employee id:");
        this.empid = sc.nextInt();

        System.out.println("enter employee name:");
        this.empName = sc.next();


        System.out.println("enter employee salary:");
        this.salary = sc.nextDouble();


        System.out.println("enter years the employee has worked for:");
        this.years = sc.nextInt();
        sc.close();

    }
    private void findIncentiveAmount(){
        if(years > 15) {
            incentive = salary * 0.13;
        }
        else if(years > 10) {
            incentive = salary * 0.1;
        }
        else if(years > 5) {
            incentive = salary * 0.05;
        }
    }
    public void displayDetails() {
        findIncentiveAmount();
        System.out.println("Employee Id - " + empid + "\tEmployee Name - " + empName + "\nTotal Income - " + (salary + incentive));
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.inputDetails();
        emp1.displayDetails();
    }
}