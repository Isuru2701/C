class Language {
	public void displayInfo() {
		System.out.println("Common English Language");
		
	}
}

class Java extends Language {
	@Override
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}

class Experiment7 {
	public static void main(String[] args) {
		//create an object of Java class

		Java jl = new Java();
		jl.displayInfo();

		//create an object of Language class
		Language l1 = new Language();
		l1.displayInfo();
	}
}