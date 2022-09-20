class Fruit {
    
	float price = 10f;
	public void show() {
		System.out.println("This is a fruit");
	}

}

class Mango extends Fruit {
	public void showPrice() {
		System.out.println(price);
	}
}

class FruitsMain {
    public static void main(String[] args) {
        Mango mango = new Mango();
        mango.show();
        mango.showPrice();
    }
}