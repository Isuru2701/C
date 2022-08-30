class Animal {
	public void displayInfo() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	public void displayInfo() {
		System.out.println("I am a dog");
	}
}

public class Experiment1 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.displayInfo();
	}
}
