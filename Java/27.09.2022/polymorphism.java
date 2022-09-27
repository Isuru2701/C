/*

what is polymorphism?
    using one method which performs several tasks depending on the parameters passed or the overriding of the statements
    inside the method.

types of polymorphism:
    1. Run Time(dynamic):
        method to be called is identified at run time: Method Override is an example of this.
    2. Compile Time(static):
        method to be called is identified at compile time: Method Overload is an example.

Method overriding:
    An inherited method in a subclass performs a different task as compared to the original method in the superclass

Method overloading:

 */
class Item {
    public void show() {
        System.out.println("This is an item");
    }
    public void display() {
        System.out.println("This is not expensive");
    }

}

class Computer extends Item {
    public void show() {  //method is overriden - dynamic polymorphism (run time)
        System.out.println("This is a computer");

    }
    public void display() {
        System.out.println("This is expensive");
    }
}

class Student {
        //method overloading - (static)compile time polymorphism
    public void show() {
        System.out.println("I am a student");

    }

    public void show(int age) {
        System.out.println("My age is: " + age);
    }
    public void show(int age, double weight) {
        System.out.println("My age is: " + age + " My weight is: " + weight);
    }
}

class Main {
    public static void main(String[] args) {
        //overriding (dynamic / runtime)
        Computer computer = new Computer();
        computer.show();

        //overloading (static / compile time)
        Student student = new Student();
        student.show();
        student.show(15);
        student.show(12, 32);
    }
}