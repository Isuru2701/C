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
}

class Computer extends Item {
    public void show() {  //method is overriden
        System.out.println("This is a computer");
    }
}

class Mac extends Computer {

}


class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.show();

    }
}