class Computer {
    private String brand; //instance member
    private static String color; //static member

    public Computer(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public static String getColor() {
        return color;
    }

}

class ComputerMain {
    public static void main(String[] args) {
        Computer hp = new Computer("HP", "black");
        Computer dell = new Computer("Dell", "green");

        System.out.println(hp.getColor());
        System.out.println(dell.getColor());
        System.out.println(Computer.getColor());
    }
}