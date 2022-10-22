class Order {

	private int orderNumber;
	private double bill; //total product value
	private Product p1, p2, p3;

//Set order number of an order
	public Order(int num, Product p1, Product p2, Product p3){
		this.orderNumber = num;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	} 

	private void calBill(){
		bill = p1.getPrice() * p1.getQty() + p2.getPrice() * p2.getQty() + p3.getPrice() * p3.getQty();

	}
	public void displayDetails(){
		calBill();
		System.out.println("Order number: " + orderNumber + "\tBill amount: " + bill); 
	}

}

class Product {
	private int productNumber, qty_ordered = 0;
	private double price = 0;


	public Product(int num, int qty, double p){
		this.productNumber = num;
		this.qty_ordered = qty;
		this.price = p;
	}
	
	public double getPrice(){
		return price;
	}

	public int getQty(){
		return qty_ordered;
	}


}

class Main {
	public static void main(String[] args){
		Product pen = new Product(1,5,20);
		Product pencil = new Product(2,10,5);
		Product eraser = new Product(3,15,3);

		Order myOrder = new Order(1, pen, pencil, eraser);
		myOrder.displayDetails();
	}

}