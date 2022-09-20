class Furniture {
    public void display() {
        System.out.println("This is a furniture");
    }
}

class Chair extends Furniture{

}

class inherit {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.display();

    }
}