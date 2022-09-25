class Customer {

    private int customer_id;
    private float quantity_bought_from_product_1, quantity_bought_from_product_2;
    private float p1total, p2total;
    private ImportedProduct p1, p2;

    public Customer(int customer_id, float quantity_bought_from_product_1, float quantity_bought_from_product_2) {
        this.customer_id = customer_id;
        this.quantity_bought_from_product_1 = quantity_bought_from_product_1;
        this.quantity_bought_from_product_2 = quantity_bought_from_product_2;
    }

    public void calcBill(ImportedProduct product1, ImportedProduct product2) {
        p1 = product1;
        p2 = product2;
        p1total = product1.getPrice() * (1 + product1.getTaxRate()) * quantity_bought_from_product_1;
        p2total = product2.getPrice() * (1 + product2.getTaxRate()) * quantity_bought_from_product_2;
    }

    public void Display() {
        System.out.println("---Bill invoice for id " + this.customer_id + "---");
        System.out.println("product 1: " + p1.getName() + "\tunit price: " + p1.getPrice() + "\tqty bought: "
                + quantity_bought_from_product_1 + "\ttotal price(with tax): " + p1total);
        System.out.println("product 2: " + p2.getName() + "\tunit price: " + p2.getPrice() + "\tqty bought: "
                + quantity_bought_from_product_2 + "\ttotal price(with tax): " + p2total);
        System.out.println("--total payable: " + (p1total + p2total) + "--");

    }

}

class Product {

    private String product_name;
    private float unit_price;

    public Product(String name, float price) {
        this.product_name = name;
        this.unit_price = price;

    }

    public String getName() {
        return this.product_name;
    }

    public float getPrice() {
        return this.unit_price;
    }

}

class ImportedProduct extends Product {

    private float tax_rate;

    public ImportedProduct(String name, float price, float tax) {
        super(name, price);
        this.tax_rate = tax;

    }

    public float getTaxRate() {
        return this.tax_rate;
    }
}

class CW3Main {

    public static void main(String[] args) {

        Customer Jen = new Customer(412, 20, 10);

        ImportedProduct apples = new ImportedProduct("apple", 12.2F, 0.3F); // 30% tax
        ImportedProduct oranges = new ImportedProduct("orange", 21.1F, 0.2F); // 20% tax

        Jen.calcBill(apples, oranges);
        Jen.Display();
    }
}