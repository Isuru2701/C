class Product {
	protected float price;
	public void setPrice(float price) {
		this.price = price;
	}
}

class LocalProduct extends Product {

	private float discount;

	public void setDiscount(float discount) {
		this.discount = discount;	
	}
	private void getLastPrice() {
		
		price = price * (1 - discount);
	}
	public float getPrice() {
		getLastPrice();
		return price;	
	}
	
	
}

class ProductMain {
	public static void main(String[] args) {
		LocalProduct lp = new LocalProduct();
		lp.setPrice(10000F);
		lp.setDiscount(0.1F);
		System.out.println(lp.getPrice());
	}
}