/*

The XYZ guest house provided rooms to their customers for reservations during last month. The attributes of their rooms given below. Each room has different number, fee and number of days reserved but room reservation fee is same for all the rooms. You are required to write an object-oriented application to perform requested tasks using your own methods and given attributes. Avoid use of the method which performs task iii by methods out of the class.

 Attributes:

    room number
    room fee for a day
    room reservation fee(1000LKR)
    number of days room reserved
    room income.


Tasks     :

    Input and set data for number, fee for a day, reservation fee and number of days reserved for three rooms in the guest house.
    Calculate income of each room.
    Output income of each room.
 */

import java.util.Scanner;

class Room {

    private int num, days;
    private float fee, income;
    private static float reservation = 1000;

    public Room(int num, int days, float fee) {
        this.num = num;
        this.days = days;
        this.fee = fee;
    }

    public void calIncome() {
        income = (fee * days) + reservation;
    }

    public void showIncome() {
        System.out.println("Income for room no." + num + " is " + income + "\n");

    }
}

class RoomMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, days;
        float fee;

        for (int i = 0; i < 3; ++i) {
            System.out.println("Enter room number: ");
            num = sc.nextInt();
            System.out.println("Enter days staying: ");
            days = sc.nextInt();
            System.out.println("Enter room fee: ");
            fee = sc.nextFloat();
            Room room = new Room(num,days, fee);

            room.calIncome();
            room.showIncome();
        }

    }
}