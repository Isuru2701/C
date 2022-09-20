class Account {
	protected int account_number;
	protected float balance;

	public void setAccount(int account_number, float initial_balance) {
		this.account_number = account_number;
		this.balance = initial_balance;

	}

}

class SavingAccount extends Account {

	public void setdeposit(float amount) {
		balance += amount;
	}
	public void setwithdraw(float amount) {
		balance -= amount;
	}
	public void print() {
		System.out.println(account_number);
		System.out.println(balance);
	}
}

public class BankApp {
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.setAccount(1001, 5000F);
		obj.setdeposit(1000f);
		obj.setwithdraw(1000f);
		obj.print();
	}
}