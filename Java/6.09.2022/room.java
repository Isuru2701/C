/*

The XYZ guest house provided rooms to their customers for reservations last month. The attributes of their rooms are given below. Each room has a different number, fee, and the number of days reserved but the room reservation fee is the same for all the rooms. You are required to write an object-oriented application to perform requested tasks using your own methods and given attributes. Avoid the use of the method which performs task iii by methods out of the class.

 Attributes:

    room number
    the room fee for a day
    room reservation fee(1000LKR)
    number of days room reserved
    room income.


Tasks     :

    Input and set data for number, fee for a day, reservation fee, and the number of days reserved for three rooms in the guest house.
    Calculate the income of each room.
    Output income of each room.
 */

class Room {

    private int num, days;
    private float fee, income;
    private static float reservation = 1000.0f;

    public Room(int num, int days, float fee) {
        this.num = num;
        this.days = days;
        this.fee = fee;
    }

    public void calIncome() {
        income = (fee * days) + reservation;
        showIncome();
    }

    private void showIncome() {
        System.out.println("Income for room no." + num + " is " + income + "\n");

    }
}

class RoomMain {
    public static void main(String[] args) {

        int num, days;
        float fee;

        Room room1 = new Room(1, 5, 1000);
        Room room2 = new Room(2, 3, 5000);
        Room room3 = new Room(3, 2, 3000);

        room1.calIncome();
        room2.calIncome();
        room3.calIncome();

    }
}