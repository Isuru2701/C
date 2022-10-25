class Customer {
	private String name;
	private int smsCount;
	private float dataUsage, callTime;
	private double mobileBill, dataBill, totalBill;


	public Customer(String name, float call, int sms, float data) {
		this.name = name;
		this.callTime = call;
		this.smsCount = sms;
		this.dataUsage = data;
	}

	public void produceBill(MobilePackage mobile, InternetPackage internet) {
		mobileBill = mobile.getRental() + mobile.getCallCharge() * callTime + mobile.getSmsCharge() * smsCount; 

		dataBill =  internet.getRental() + internet.getDataCharge() * dataUsage;

		totalBill = mobileBill + dataBill;

		System.out.println("Monthly bill for Customer " + name);
		System.out.println("Mobile Bill:\t" + mobileBill);
		System.out.println("Internet Bill:\t" + dataBill);
		System.out.println("---------------------------");
		System.out.println("Total Bill:\t" + totalBill);
	   
	}
}

class MobilePackage {
	private double callCharge, smsCharge, rental;

	public MobilePackage(double call, double sms, double rental) {
		this.callCharge = call;
		this.smsCharge = sms;
		this.rental = rental;
	}

	public double getCallCharge(){
		return callCharge;
	}

	public double getSmsCharge(){
		return smsCharge;
	}

	public double getRental(){
		return rental;
	}


}

class InternetPackage {

	private double dataCharge, rental;

	public InternetPackage(double data, double rental) {
		this.dataCharge = data;
		this.rental = rental;
	}

	public double getDataCharge(){
		return dataCharge;
	}

	public double getRental(){
		return rental;
	}
}


class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer("John", 500, 1000, 5.5f);

		MobilePackage comLite = new MobilePackage(2.0, 0.5, 200);
		InternetPackage familyPro = new InternetPackage(25, 300);
		c1.produceBill(comLite, familyPro);
	}
}
