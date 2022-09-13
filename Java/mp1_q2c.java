/*
XYZ Company exports many products to different countries. There are several employees 
working in XYZ company. Each employee has employee id, employee name, basic salary, 
number of service years and monthly incentive. The method ‘inputDetails’ is used to input 
values for data members. The method ‘findIncentiveAmount’ is used to calculate incentive 
of an employee. Write an object-oriented program to perform the operation of 3 employees.

Services years > 5  | 5% from basic salary
Services years > 10 | 10% from basic salary
Services years > 15 | 13% from basic salary

The method ‘displayDetails’ is used to display the following report. 
Total Income =basic salary + monthly incentive

***********************************************
Employee Id – e001 Employee Name – Saman
Total Income – 75000.00
------------------------------------------

*/

class Employee {
    private int id, years;
    private String name;
    private double salary, incentive;

    public void inputDetails(int id, int years, String name, double salary) {
        this.id = id;
        this.years = years;
        this.name = name;
        this.salary = salary;
    }

    private double findIncentiveAmount() {
        if (years > 15) {
            incentive = salary * 0.13;
        } else if (years > 10) {
            incentive = salary * 0.10;
        } else if (years > 5) {
            incentive = salary * .05;
        }
        return incentive;
    }

    public void displayDetails() {
        System.out.println("***********************************************\n" + "Employee Id - " + id
                + "\t Employee Name - " + name + "\n Total Income - " + (salary + findIncentiveAmount()));
    }

}

class MP1Q2C {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.inputDetails(1, 6, "Saman", 50000);
        emp2.inputDetails(2, 4, "Sadun", 40000);
        emp3.inputDetails(4, 13, "Deenuja", 75000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

    }
}