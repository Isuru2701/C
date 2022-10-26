class Customer {

	private String customer_id;
	private int quantity_bought_from_product_1, quantity_bought_from_product_2;
	private double bill;
	private ImportedProduct p1, p2;

	public void calBill() {
		bill = 

	}

	public void displayDetails() {
		System.out.println();
	}
}

class Product {
	private String product_name;
	private double unit_price;

	public Product(String name, double price){
		this.product_name = name;
		this.unit_price = price;
	}

	public String getName(){
		return product_name;
	}

	public double getPrice(){
		return unit_price;
	}
}

class ImportedProduct extends Product{
	private float tax_rate;
	
}

class Main {

	Customer john = new Customer();
}