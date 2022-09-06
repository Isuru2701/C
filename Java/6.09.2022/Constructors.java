class Keyboard {
	
	private String color, model;
	private int keys;

	public Keyboard(int keys) {
		this.keys = keys;

	}
	
	public void setKeys(int keys) {
		this.keys = keys;	
	}

	public int getKeys() {
		return keys;
	}
	

}

class ConstructorMain {
	public static void main(String[] args) {
		Keyboard myKeyboard = new Keyboard(134);
		System.out.println("number of keys: " + myKeyboard.getKeys());
	}
}