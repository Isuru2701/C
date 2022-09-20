import java.util.Scanner;

class Product {

	protected int productNumber;
	protected float productPrice;
	Scanner sc = new Scanner(System.in);

	public void setProductNumber() {
	System.out.println("Enter product number");
	productNumber = sc.nextInt();
	}

	public void setProductPrice() {
	System.out.println("Enter product price");
	productPrice = sc.nextFloat();
	}
	
	public void setDetails() {
		setProductNumber();
		setProductPrice();
	}

	

}

class Phone extends Product {
	private float discountRate, discountedPrice;

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

	public void outputDiscount() {
		discountedPrice = productPrice * (1 - discountRate);
		System.out.println("Discounted price for " + productNumber + " : " + discountedPrice);
	}
	
	
}

class PhoneMain {
	public static void main(String[] args) {
		
		Phone samsung = new Phone();
		Phone iphone = new Phone();

		samsung.setDetails();
		iphone.setDetails();

		samsung.setDiscountRate(0.2F); //20% discount
		iphone.setDiscountRate(0.1F); //10% discount

		samsung.outputDiscount();
		iphone.outputDiscount();
	

	}
}