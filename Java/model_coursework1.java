class Customer {
	private String cName;
	private float calldur, dataUsage, smsNum;
	private double mobileBill, dataBill, totalBill;

	public Customer(String n, float dur, float sms, float data) {

		cName = n;	
		calldur = dur;
		smsNum = sms;
		dataUsage = data;
	}

	public void produceBill(MobilePackage mobile, InternetPackage internet) {
		
		mobileBill = (mobile.getCharge() * calldur) + (mobile.getSms() * smsNum) + mobile.getMonthly();
		
		dataBill = (internet.getCharge() * dataUsage) + internet.getMonthly();

		totalBill = mobileBill + dataBill;

		System.out.println("-----Bill for customer " + cName + " -----"); 
		System.out.println("Mobile Package charges: "  + mobileBill);
		System.out.println("Internet Package charges: "  + dataBill);
		System.out.println("Total arrears: " + totalBill); 

	}

}

class MobilePackage {

	private float charge, sms, monthly;
	
	public MobilePackage(float c, float s, float m) {
		
		charge = c;
		sms = s;
		monthly = m;
		
	}

	public float getCharge() {
		return charge;
	}

	public float getSms() {
		return sms;
	}

	public float getMonthly() {
		return monthly;
	}

}

class InternetPackage {

	private float charge, monthly;

	public InternetPackage(float c, float m) {
		charge = c;
		monthly = m;
	}

	public float getCharge() {
		return charge;
	}

	public float getMonthly() {
		return monthly;
	}

}

class Main {

	public static void main(String[] args) {

		//do we have to 'set' the data or take inputs? ask Sir l8r
		Customer C1 = new Customer("John", 200F, 400F, 20F);

		MobilePackage lite = new MobilePackage(10F, 1F, 500F);
		InternetPackage web = new InternetPackage(200F, 400F);

		C1.produceBill(lite, web);

		
		
	}

}