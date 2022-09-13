//ABC company purchases milk from farmers, converts that into ice cream and sells them.

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

    public Milk sells(float qty) {
        milk.setQtyBought(qty);
        return milk;
    }
}

class Milk {
    private float price, cream, qtyBought;

    public Milk(float price, float cream) {
        this.price = price;
        this.cream = cream;
    }

    public float getCream() {
        return cream;
    }

    public float getPrice() {
        return price;
    }

    public float getQtyBought() {
        return qtyBought;
    }

    public void setQtyBought(float qtyBought) {
        this.qtyBought = qtyBought;
    }

}

class IceCream {
    private static float price = 500F;
    private float qtyOnHand = 0, income = 0;
    private Milk milk;

    public void makeIceCream(Milk milk) {
        this.milk = milk;
        qtyOnHand += this.milk.getQtyBought() * this.milk.getCream();

        //income  == revenue - costs, so we need to remove the cash outflow
        income -= this.milk.getQtyBought() * this.milk.getPrice();
        System.out.println("Qty ice cream made: " + qtyOnHand);
    }

    public void sell(float qty) {
        if (qtyOnHand >= qty) {
            qtyOnHand -= qty;
            income += qty * price;
        }
        else {
            System.out.println("Stock is not enough to fulfill order!");
        }
    }

    public float getIncome() {
        return income;
    }
}

class ABC {
    public static void main(String[] args) {
        //types of milk:
        Milk highQuality = new Milk(250, 50);
        Milk medQuality = new Milk(150, 30);
        Milk lowQuality = new Milk(80, 20);

        //types of ice cream:
        IceCream chocolate = new IceCream();
        IceCream vanilla = new IceCream();
        IceCream mango = new IceCream();

        //farmers:
        Farmer J = new Farmer(2084, "J", "Kandy", highQuality);
        Farmer H = new Farmer(4013, "H", "Ambewella", medQuality);


        //buy from farmer & make into any ice-cream flavor, chocolate in this example:
        Milk bought = J.sells(100F);
        chocolate.makeIceCream(bought);
        chocolate.sell(50F);

        bought = H.sells(500F);
        vanilla.makeIceCream(bought);
        bought = J.sells(300F);
        mango.makeIceCream(bought);

        mango.sell(310F);
        vanilla.sell(250F);

        //summarize:
        System.out.println("Profits from chocolate: " + chocolate.getIncome());
        System.out.println("Profits from vanilla: " + vanilla.getIncome());
        System.out.println("Profits from mango: " + mango.getIncome());


    }


}