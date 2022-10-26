abstract class Customer {
	protected String firstName, surName;
	protected int qty;
	protected Item item;
	protected double bill; 

	public Customer(String fn, String sn, int qty){
		this.firstName = fn;
		this.surName = sn;
		this.qty = qty;
	}

	abstract protected void findBillAmount(Item item);

	public void produceBill(Item item){
		this.item = item;
		findBillAmount(this.item);
		System.out.println("--Bill--");
		System.out.println("Customer name: " + firstName + " " + surName);
		System.out.println("total payable: " + String.format("%.2f", bill));
	}
}

class LocalCustomer extends Customer {
	private float discount;
	
	public LocalCustomer(String fn, String sn, int qty, float discount) {
		super(fn, sn, qty);
		this.discount = discount;

	}
	
	public void findBillAmount(Item item){
		bill = (item.getPrice() * (1 - discount)) * qty;
	}
}

class ForeignCustomer extends Customer {
	private float tax;

	public ForeignCustomer(String fn, String sn, int qty, float tax) {
		super(fn, sn, qty);
		this.tax = tax;

	}
	
	public void findBillAmount(Item item){
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

		//(String fn, String sn, int qty, float discount)
		LocalCustomer A = new LocalCustomer("Janeth", "Silva", 20, 0.1f);
		Item P = new Item(10);
		A.produceBill(P);

		//(String fn, String sn, int qty, float tax)
		ForeignCustomer B = new ForeignCustomer("George", "Martin", 50, 0.2f);
		Item Q = new Item(10);
		B.produceBill(Q);
		
	}
}
