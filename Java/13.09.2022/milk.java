/*
purchase milk from the farmer and sell a specific quantity of ice-cream made with that purchased milk
and calculate the total income made by the ABC company
 */

class Farmer {
    private int farmerid;
    private String name, address;
    private Milk milk;

    public Farmer(int farmerid, String name, String address, Milk milk) {
        this.farmerid = farmerid;
        this.name = name;
        this.address = address;
        this.milk = milk;
    }

    public Milk sell(float bought) {
        milk.setLiters(bought);
        return milk;
    }

}

class Milk {
    private float price, cream;
    private float liters = 0;

    public Milk(float price, float cream) {
        this.price = price;
        this.cream = cream;
    }

    public void setLiters(float liters) {
        this.liters = liters;
    }

    public float getCream() {
        return cream;
    }

    public float getPrice() {
        return price;
    }
    public float getLiters() {
        return liters;
    }

}

class IceCream {

    private static float price = 500F;
    private float qty = 0, income = 0;

    public void make(Milk milk) {
        this.qty += milk.getCream() * milk.getLiters();
        milk.setLiters(0F);
    }

    public void sell(float qty) {
        if (this.qty > qty) {
            income += this.qty * price;
            this.qty = this.qty - qty;
        }
    }
    public float getIncome() {
        return income;
    }

}

class MilkMain {
    public static void main(String[] args) {

        IceCream chocolate = new IceCream();
        IceCream vanilla = new IceCream();
        IceCream mango = new IceCream();

        Milk highQuality = new Milk(250, 50);
        Milk mediumQuality = new Milk(150, 30);
        Milk lowQuality = new Milk(80, 20);


        Farmer J = new Farmer(1083, "J", "Kandy", highQuality);
        Milk bought = J.sell(100);

        chocolate.make(bought);
        chocolate.sell(50);

        System.out.println("Income from chocolate: " + chocolate.getIncome());
        System.out.println("Income from vanilla: " + vanilla.getIncome());
        System.out.println("Income from mango: " + mango.getIncome());

    }
}