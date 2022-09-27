/*
a.      Input and set data for units consumed, unit charges, and tax fees of two water bill using constructor(s).

b.      Calculate amounts of two water bills overriding method calculateBill() .

c.      Output amounts of two water bills using showbill().

 */

class Bill {
    protected float units_consumed, unit_charge;

    public Bill (float consumed, float charge) {
        this.units_consumed = consumed;
        this.unit_charge = charge;

    }

    public void calculateBill() {
        System.out.println(unit_charge * units_consumed);
    }
}

class WaterBill extends Bill {
    private float tax_fee, water_bill_amount;

    public WaterBill(float consumed, float charge, float tax_fee) {
        super(consumed, charge);
        this.tax_fee = tax_fee;

    }
    public void calculateBill() {
        water_bill_amount = (units_consumed * unit_charge) + tax_fee;
    }

    public void showBill() {
        System.out.println("Bill amount (with tax fee): " + water_bill_amount);
    }
}

class Activity7 {
    public static void main(String[] args) {
        WaterBill billno1 = new WaterBill(20, 10, 500);
        WaterBill billno2 = new WaterBill(10, 10, 100);

        billno1.calculateBill();
        billno2.calculateBill();

        billno1.showBill();
        billno2.showBill();
    }
}