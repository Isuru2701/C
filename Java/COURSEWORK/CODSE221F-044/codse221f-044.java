/*
		C <-> I (1:1)
	     / \
	    LC  FC
*/


//all customers must fall into local or foreign, so making the superclass abstract

abstract class Customer { 
	protected String firstName, surName;
	protected int qty;
	protected double bill; 

	//since both subclasses have this, declaring it here is more efficient
	protected Item item; 

	public Customer(String fn, String sn, int qty) {
		this.firstName = fn;
		this.surName = sn;
		this.qty = qty; //only requires one qty variable
	}

	//no point in writing statements inside this, as it gets overriden
	abstract protected void findBillAmount(); 

	public void produceBill(Item i){
		this.item = i;
		findBillAmount();
		System.out.println("- - Bill - -");
		System.out.println("Customer name: " + firstName + " " + surName);
		System.out.println("Total Payable: " + String.format("%.2f", bill));
		System.out.println("- - - - - - -");
	}
}

class LocalCustomer extends Customer {
	private float discount;
	
	public LocalCustomer(String fn, String sn, int qty, float discount) {
		super(fn, sn, qty);
		this.discount = discount;
	}
	
	protected void findBillAmount() {
		bill = (item.getPrice() * (1 - discount)) * qty;
	}
}

class ForeignCustomer extends Customer {
	private float tax;

	public ForeignCustomer(String fn, String sn, int qty, float tax) {
		super(fn, sn, qty);
		this.tax = tax;
	}
	
	public void findBillAmount() {
		bill = (item.getPrice() * (1 + tax)) * qty;
	}
}

class Item {
	private double price;

	public Item(double p) {
		this.price = p;
	}

	public double getPrice() {
		return price;
	}
}

class Main {
	
	public static void main(String[] args) {

		//hardcoding values as question doesn't say to take inputs from user

		//(String fn, String sn, int qty, float discount)
		LocalCustomer A = new LocalCustomer("Janeth", "Silva", 20, 0.1f);

		//(double price);

		//initializing Item obj and passing it into the method is more representative of a whole program than initializing beforehand inside the customer class.

		Item P = new Item(10);
		A.produceBill(P);

		//(String fn, String sn, int qty, float tax)
		ForeignCustomer B = new ForeignCustomer("George", "Martin", 50, 0.2f);
		Item Q = new Item(10);
		B.produceBill(Q);
		
	}
}
