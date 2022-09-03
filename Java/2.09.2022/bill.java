class Bill {

    private int number;
    private float units, charge, payable;

    public void setNumber(int number) {
        this.number = number;
    }
    public void setUnits(float units) {
        this.units = units;
    }
    public void setCharge(float charge) {
        this.charge = charge;
    }
    

    //If monthly units consumed is greater than 100,increase unit charge by 2%.
    public float invoice() {

        if(units > 100) {
            return units * (charge * 1.02F);

        }
        else
        {
            return units * charge;
        }
    }

}

class BillMain {

    public static void main(String[] args) {
        
        //test object 1
        Bill myBill = new Bill();
        myBill.setNumber(502382);
        myBill.setUnits(420F);
        myBill.setCharge(10F);
        System.out.println(myBill.invoice());

        //test object 2
        Bill myBill2 = new Bill();
        myBill2.setNumber(502382);
        myBill2.setUnits(90F);
        myBill2.setCharge(10F);
        System.out.println(myBill2.invoice());       

    }
}