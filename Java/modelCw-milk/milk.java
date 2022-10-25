import java.util.Scanner;

class Milk {
	protected double price, totalCost;
	protected char gradeOfMilk;
	protected float qty, creamQty;

	private void calculateTotalCost() {
		totalCost = price * qty;
	}

	public double getPrice(){
		return price;
	}

	public char getGrade(){
		return gradeOfMilk;
	}

	public float getQty(){
		return qty;
	}

	public float getCreamQty(){
		return creamQty;
	}

	public double getCost(){
		calculateTotalCost();
		return totalCost;
	}

	public void setQty(float qty){
		this.qty = qty;
	}




}

class HighQualityMilk extends Milk {

	public HighQualityMilk(){
		price = 750;
		gradeOfMilk = 'A';
		creamQty = 2f;
	}
}

class MidQualityMilk extends Milk {

	public MidQualityMilk(){
		price = 600;
		gradeOfMilk = 'B';
		creamQty = 1.5f;	
	}
}

class LowQualityMilk extends Milk {
	
	public LowQualityMilk(){
		price = 500;
		gradeOfMilk = 'C';
		creamQty = 1f;
	}	
}



class IceCream {
	protected String flavor;
	protected float qtyMade, sellingPrice;
	protected double income = 0;
	protected Milk milk;

	private void calQty(){
		qtyMade = milk.getQty() * milk.getCreamQty();
	}
	
	private void calIncome(){
		calQty();
		income = qtyMade * sellingPrice;
	}

	public void produceReport(Milk m){
		milk = m;
		calIncome();
		System.out.println("---- R e p o r t ----");
		System.out.println("Total expenses:\t" +  String.format("%.2f", milk.getCost()));
		System.out.println("Total Income:\t" + String.format("%.2f", income));
		System.out.println("Net Profit:\t" + String.format("%.2f",(income - milk.getCost() )));

	}

	
}

class Chocolate extends IceCream {

	public Chocolate() { 
		flavor = "Chocolate";
		sellingPrice = 1500f;
	}
}


class Strawberry extends IceCream {

	public Strawberry() {
		flavor = "Strawberry";
		sellingPrice = 1200f;	
	}
}

class Vanilla extends IceCream {

	public Vanilla() {
		flavor = "Vanilla";
		sellingPrice = 1000f;
	}
}


/*

	Take milk quantity bought , grade of milk and the flavor of ice-cream as inputs and 	Calculate
	i. The total expenses of the company for that sale,
	ii. Total Income company obtained by that sale
	iii. Net profit from that sale.
*/

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Milk milkObj = new Milk();
		boolean flag = false;
		String input = "";

		//Validation
		do{
			System.out.println("Enter grade of milk: ");

			switch (sc.next().toUpperCase()){
				case "A":
					milkObj = new HighQualityMilk();
					flag = true;
					break;
	
				case "B":
					milkObj = new MidQualityMilk();
					flag = true;
					break;

				case "C":
					milkObj = new LowQualityMilk();
					flag = true;
					break;

				default:
					System.out.println("Invalid input. Please enter A, B or C");
					break;
			}
		}while(!flag);
		
		do { 
		System.out.println("Enter quantity of milk bought: ");
		input = sc.next();
			try { 
				milkObj.setQty(Float.parseFloat(input));
				break;
			} catch(Exception e) {
				System.out.println("Please enter a decimal number");
			}
		}while(true);

		flag = false;

		do { 
			System.out.println("Enter Flavour: ");
			input = sc.next();
			switch (input.toLowerCase()) {
				case "chocolate":
					Chocolate chocolate = new Chocolate();
					chocolate.produceReport(milkObj);
					flag = true;
					break;

				case "vanilla":
					Vanilla vanilla= new Vanilla();
					vanilla.produceReport(milkObj);
					flag = true;
					break;

				case "strawberry":
					Strawberry strawberry = new Strawberry();
					strawberry.produceReport(milkObj);
					flag = true;
					break;
				
				default:
					System.out.println("Please enter either Chocolate, Vanilla, or Strawberry");
					break;
			}
		}while(!flag);

		sc.close();
	}
}