class Door {
    void open() {
        System.out.println("Door opened");
    }

}

class DoorMain {
    public static void main(String[] args) {
        Door thisDoor = new Door();
        thisDoor.open();
    }
}
