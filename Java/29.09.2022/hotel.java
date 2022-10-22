class Guest {
    protected String id;
    protected double bill;

    public Guest(String id, double bill) {
        this.id = id;
        this.bill = bill;

    }
}

class ForeignGuest extends Guest{
    private float taxRate;

    public ForeignGuest(String id, double bill, float taxRate) {
        super(id, bill);
        this.taxRate = taxRate;
    }

    public void calculateBill() {
        bill *= (1 + taxRate);
        System.out.println("Bill amount with tax: " + String.format("%.2f", bill));
    }
}


class Main {
    public static void main(String[] args) {
        ForeignGuest guest = new ForeignGuest("FG1", 5000, 0.1f);

        guest.calculateBill();
    }
}