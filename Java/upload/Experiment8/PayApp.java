class Payment {
	protected float amount;

	public Payment(float amount) {
		this.amount = amount;
	}
}

class CreditCard extends Payment {
	private final float credit_amount = 8000;
	private final String card_holder_name;
	private final String name = "Kamal";
	private float balance;

	public CreditCard(float payamount, String name) {
		super(payamount);
		this.card_holder_name = name;
	}

	public void setAuthorize() { 
		if(card_holder_name.equals(name)) { 
			balance  = credit_amount - amount;
			System.out.println(balance);
		}
		else {
			System.out.println("Invalid card holder");
		}
	}
}

public class PayApp {
	public static void main(String[] args) {
		CreditCard obj = new CreditCard(2000F, "Kamal");
		obj.setAuthorize();
	}
}