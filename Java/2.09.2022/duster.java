class Duster {
	
	private float price;
	public void setPrice(float p) {
		price  = p;
	}
	public float getPrice() {
		return price;
	}
}

class DusterMain {
	public static void main(String[] args) {
		Duster myDuster = new Duster();
		myDuster.setPrice(400);
		System.out.println(myDuster.getPrice());
	}
}